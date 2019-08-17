/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jb.test.networktest;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import javax.imageio.ImageIO;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Jan
 */
class RestAPI {

    static final String cMethodGet = "GET";
    static final String cMethodPut = "PUT";

    static final String cMediaJSON = "application/json";
    static final String cMediaText = "text/plain";
    static final String cMediaImage = "image/jpg";

    private String mMethod;
    private String mMediaRequest;
    private String mMediaReply;
    private String mUrl;
    private String mPars;
    private String mRequest;

    RestAPI() {
        mMethod = cMethodGet;
        mMediaRequest = cMediaText;
        mMediaReply = cMediaJSON;
        mUrl = "";
        mPars = "";
        mRequest = "";
    }

    void xMethod(String pMethod) {
        mMethod = pMethod;
    }

    void xMediaRequest(String pMedia) {
        mMediaRequest = pMedia;
    }

    void xMediaReply(String pMedia) {
        mMediaReply = pMedia;
    }

    void xUrl(String pUrl) {
        mUrl = pUrl;
    }

    void xPars(String pPars) {
        mPars = pPars;
    }

    void xRequest(String pRequest) {
        mRequest = pRequest;
    }

    RestResult xCallApi() {
        String lOutput;
        StringBuilder lStr;
        String lUrlS;
        URL lUrl;
        HttpURLConnection lConn = null;
        InputStream lInput;
        BufferedImage lImage;
        DataOutputStream lOutStream;
        BufferedReader lBufRead;
        String lLine;
        int lRespCode;
        int lResult;
        String lMessage;
        RestResult lRestResult;

        lStr = new StringBuilder();
        if (!mPars.equals("")) {
            lUrlS = mUrl + "?" + mPars;
        } else {
            lUrlS = mUrl;
        }
        try {
            lUrl = new URL(lUrlS);
            lConn = (HttpURLConnection) lUrl.openConnection();
            lConn.setRequestMethod(mMethod);
            lConn.setRequestProperty("Accept", mMediaReply);
            lConn.setConnectTimeout(5000);
            lConn.setReadTimeout(5000);
            if (!mRequest.equals("")) {
                lConn.setRequestProperty("Content-Type", mMediaRequest);
                lConn.setDoOutput(true);
                lOutStream = new DataOutputStream(lConn.getOutputStream());
                lOutStream.writeBytes(mRequest);
                lOutStream.flush();
                lOutStream.close();
            }

            lRespCode = lConn.getResponseCode();
            if (lRespCode == 200) {
                if (mMediaReply.equals(cMediaImage)) {
                    try {
                        lInput = lConn.getInputStream();
                        lImage = ImageIO.read(lInput);
                        lRestResult = new RestResult(Result.cResultOK, lImage);
                    } catch (Exception pExc) {
                        lRestResult = new RestResult("Error processing image", Result.cResultError);
                    }
                } else {
                    lResult = Result.cResultOK;
                    lMessage = "OK";
                    lBufRead = new BufferedReader(new InputStreamReader(
                            (lConn.getInputStream())));
                    while ((lLine = lBufRead.readLine()) != null) {
                        lStr.append(lLine);
                    }
                    lOutput = lStr.toString();
                    lRestResult = new RestResult(lResult, lOutput, lMessage);
                    lBufRead = new BufferedReader(new InputStreamReader(
                            (lConn.getInputStream())));
                    while ((lLine = lBufRead.readLine()) != null) {
                        lStr.append(lLine);
                    }
                    lOutput = lStr.toString();
                    lRestResult = new RestResult(lResult, lOutput, lMessage);
                }
            } else {
                lResult = Result.cResultError;
                lMessage = "Responsecode: " + lRespCode;
                lBufRead = new BufferedReader(new InputStreamReader(
                        (lConn.getInputStream())));
                while ((lLine = lBufRead.readLine()) != null) {
                    lStr.append(lLine);
                }
                lOutput = lStr.toString();
                lRestResult = new RestResult(lResult, lOutput, lMessage);
            }
        } catch (MalformedURLException e) {
            lRestResult = new RestResult("Malformed URL: " + e.getLocalizedMessage(), Result.cResultError);
        } catch (SocketTimeoutException pExc) {
            if (pExc.getLocalizedMessage() == null) {
                lRestResult = new RestResult("Read Time-Out", Result.cResultReadTimeOut);
            } else {
                lRestResult = new RestResult("Connect Time-Out", Result.cResultConnectTimeOut);
            }
        } catch (IOException e) {
            lRestResult = new RestResult("IO Exception:" + e.getLocalizedMessage(), Result.cResultError);
        } finally {
            if (lConn != null) {
                lConn.disconnect();
            }
        }
        return lRestResult;
    }

    class RestResult {

        private int mResult;
        private String mText;
        private JSONObject mReplyJ;
        private String mReplyS;
        private boolean mJson;
        private BufferedImage mImage;

        int xResult() {
            return mResult;
        }

        String xText() {
            return mText;
        }

        JSONObject xReplyJ() {
            if (mJson) {
                return mReplyJ;
            } else {
                return null;
            }
        }

        String xReplyS() {
            return mReplyS;
        }
        
        BufferedImage xImage(){
            return mImage;
        }

        RestResult(int pResult, String pOutput) {
            mReplyS = pOutput;
            mImage = null;
            if (mMediaReply.equals(cMediaJSON)) {
                try {
                    mReplyJ = new JSONObject(pOutput);
                    mResult = pResult;
                    mText = "OK";
                    mJson = true;
                } catch (JSONException pExc) {
                    mResult = Result.cResultOutputFout;
                    mText = "no valid JSON Object received";
                    mReplyJ = null;
                    mJson = false;
                }
            } else {
                mReplyJ = null;
                mResult = Result.cResultOK;
                mText = "OK";
                mJson = false;
            }
        }

        RestResult(int pResult, String pOutput, String pMessage) {
            mResult = pResult;
            mReplyS = pOutput;
            mText = pMessage;
            mImage = null;
            if (pResult == Result.cResultOK && mMediaReply.equals(cMediaJSON)) {
                try {
                    mReplyJ = new JSONObject(pOutput);
                    mJson = true;
                } catch (JSONException pExc) {
                    mResult = Result.cResultOutputFout;
                    mText = "no valid JSON Object received";
                    mReplyJ = null;
                    mJson = false;
                }
            } else {
                mReplyJ = null;
                mJson = false;
            }
        }

        RestResult(String pText, int pResult) {
            mReplyJ = null;
            mReplyS = null;
            mResult = pResult;
            mText = pText;
            mImage = null;
        }

        RestResult(int pResult, BufferedImage pImage) {
            mReplyJ = null;
            mReplyS = null;
            mResult = pResult;
            mText = "";
            mImage = pImage;
        }
    }
}
