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
class IPentry {

    private int mID;
    private String mName;
    private int[] mIP;
    private int mPort;

    IPentry(IPentry pEntry) {
        if (pEntry == null) {
            mID = -1;
            mName = "";
            mIP = new int[]{0, 0, 0, 0};
            mPort = 0;
        } else {
            mID = pEntry.mID;
            mName = pEntry.mName;
            mIP = pEntry.mIP;
            mPort = pEntry.mPort;
        }
    }

    IPentry(String pName, int[] pIP, int pPort) {
        mID = -1;
        mName = pName;
        mIP = pIP;
        mPort = pPort;
    }

    IPentry(int pID, String pName, int pIP1, int pIP2, int pIP3, int pIP4, int pPort) {
        mID = pID;
        mIP = new int[4];
        mName = pName;
        mIP[0] = pIP1;
        mIP[1] = pIP2;
        mIP[2] = pIP3;
        mIP[3] = pIP4;
        mPort = pPort;
    }

    int xID(){
        return mID;
    }
    
    void xName(String pName){
        mName = pName;
    }
    
    String xName() {
        return mName;
    }

    int xIP(int pPos) {
        if (pPos >= 0 && pPos < mIP.length) {
            return mIP[pPos];
        } else {
            return 0;
        }
    }

    String xIP() {
        return String.valueOf(mIP[0]) + "." + String.valueOf(mIP[1]) + "." + String.valueOf(mIP[2]) + "." + String.valueOf(mIP[3]);
    }

    int xPort() {
        return mPort;
    }
}
