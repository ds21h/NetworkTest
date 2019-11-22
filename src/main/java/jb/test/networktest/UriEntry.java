/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jb.test.networktest;

/**
 *
 * @author Jan
 */
class UriEntry {
    private int mID;
    private String mService;
    private String mName;
    private int mUriType;
    private String mUri;
    private String mParms;
    private int mReqType;
    private String mRequest;
    private int mRespType;

    UriEntry(UriEntry pEntry) {
        if (pEntry == null) {
            mID = -1;
            mService = "";
            mName = "";
            mUriType = -1;
            mUri = "";
            mParms = "";
            mReqType = -1;
            mRequest = "";
            mRespType = -1;
        } else {
            mID = pEntry.mID;
            mService = pEntry.mService;
            mName = pEntry.mName;
            mUriType = pEntry.mUriType;
            mUri = pEntry.mUri;
            mParms = pEntry.mParms;
            mReqType = pEntry.mReqType;
            mRequest = pEntry.mRequest;
            mRespType = pEntry.mRespType;
        }
    }

    UriEntry(String pService, String pName, int pUriType, String pUri, String pParms, int pReqType, String pRequest, int pRespType) {
        mID = -1;
        mService = pService;
        mName = pName;
        mUriType = pUriType;
        mUri = pUri;
        mParms = pParms;
        mReqType = pReqType;
        mRequest = pRequest;
        mRespType = pRespType;
    }

    UriEntry(int pId, String pService, String pName, int pUriType, String pUri, String pParms, int pReqType, String pRequest, int pRespType) {
        mID = pId;
        mService = pService;
        mName = pName;
        mUriType = pUriType;
        mUri = pUri;
        mParms = pParms;
        mReqType = pReqType;
        mRequest = pRequest;
        mRespType = pRespType;
    }
    
    int xID(){
        return mID;
    }
    
    void xService(String pService){
        mService = pService;
    }
        
    String xService() {
        return mService;
    }
    
    void xName(String pName){
        mName = pName;
    }
    
    String xName() {
        return mName;
    }

    int xUriType(){
        return mUriType;
    }
    
    String xUri(){
        return mUri;
    }

    String xParms(){
        return mParms;
    }
    
    int xReqType(){
        return mReqType;
    }
    
    String xRequest(){
        return mRequest;
    }
    
    int xRespType(){
        return mRespType;
    }
}
