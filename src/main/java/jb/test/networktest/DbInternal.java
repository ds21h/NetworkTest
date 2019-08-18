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
class DbInternal {
    private int mVersion;
    
    DbInternal(int pVersion){
        mVersion = pVersion;
    }
    
    int xVersion(){
        return mVersion;
    }
}
