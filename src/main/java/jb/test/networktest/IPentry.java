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
    private String mName;
    private int[] mIP;
    private int mPort;
    
    IPentry(String pName, int pIP1, int pIP2, int pIP3, int pIP4, int pPort){
        mIP = new int[4];
        mName = pName;
        mIP[0] = pIP1;
        mIP[1] = pIP2;
        mIP[2] = pIP3;
        mIP[3] = pIP4;
        mPort = pPort;
    }
    
    String xName(){
        return mName;
    }
    
    String xIP(){
        return String.valueOf(mIP[0]) + "." + String.valueOf(mIP[1]) + "." + String.valueOf(mIP[2]) + "." + String.valueOf(mIP[3]);
    }
    
    int xPort(){
        return mPort;
    }
}
