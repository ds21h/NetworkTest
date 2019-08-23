/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jb.test.networktest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jan
 */
public class Data {

    private static Data mInstance = null;

    static Data getInstance() {
        if (mInstance == null) {
            mInstance = new Data();
        }
        return mInstance;
    }

    private Connection mConn;
    private int mStatus;
    private String mText = "";
    public static final int cNotSet = -1;
    public static final int cOK = 0;
    public static final int cSQLite_not_found = 100;
    public static final int cSQL_error = 200;
    public static final int cError = 999;

    private Data() {
        mStatus = cNotSet;

        try {
            Class.forName("org.sqlite.JDBC");
            mConn = DriverManager.getConnection("jdbc:sqlite:NetworkTest.db");
            mStatus = cOK;
            sInitDB();
        } catch (ClassNotFoundException pExc) {
            mStatus = cSQLite_not_found;
        } catch (SQLException pExc) {
            mStatus = cSQL_error;
            mText = pExc.getMessage();
        } catch (Exception pExc) {
            mStatus = cSQL_error;
            mText = pExc.getMessage();
        }
    }

    private void sInitDB() {
        DbInternal lInternal;

        lInternal = sTestDB();
        if (lInternal == null) {
            sDeleteDB();
            sDefineDB();
        } else {
            if (lInternal.xVersion() != 1){
                sDeleteDB();
                sDefineDB();
            }
        }
    }

    private void sDeleteDB() {
        sDeleteInternal();
        sDeleteIP();
    }

    private void sDeleteInternal() {
        Statement lStm;
        String lSql = "DROP TABLE IF EXISTS Internal;";
        boolean lResult;

        try {
            lStm = mConn.createStatement();
            lResult = lStm.execute(lSql);
            lStm.close();
        } catch (SQLException ex) {
            mStatus = cSQL_error;
            mText = ex.getMessage();
        }
    }

    private void sDeleteIP() {
        Statement lStm;
        String lSql = "DROP TABLE IF EXISTS IPaddress;";
        boolean lResult;

        try {
            lStm = mConn.createStatement();
            lResult = lStm.execute(lSql);
            lStm.close();
        } catch (SQLException ex) {
            mStatus = cSQL_error;
            mText = ex.getMessage();
        }
    }

    private void sDefineDB() {
        if (sDefineInternal()) {
            sInitInternal();
        };
        sDefineIP();
    }

    private boolean sDefineInternal() {
        Statement lStm;
        String lSql = "CREATE TABLE Internal "
                + " (ID Text primary key, "
                + "Version integer Not Null)";
        boolean lResult;

        try {
            lStm = mConn.createStatement();
            lStm.execute(lSql);
            lStm.close();
            lResult = true;
        } catch (SQLException ex) {
            mStatus = cSQL_error;
            mText = ex.getMessage();
            lResult = false;
        }
        return lResult;
    }

    private boolean sInitInternal() {
        Statement lStm;
        String lSql = "INSERT INTO Internal "
                + "(ID, Version) "
                + "VALUES "
                + "('NetworkTest', 1)";
        boolean lResult;

        try {
            lStm = mConn.createStatement();
            lStm.execute(lSql);
            lStm.close();
            lResult = true;
        } catch (SQLException ex) {
            mStatus = cSQL_error;
            mText = ex.getMessage();
            lResult = false;
        }
        return lResult;
    }

    private boolean sDefineIP() {
        Statement lStm;
        String lSql = "CREATE TABLE IPaddress ("
                + "IPid integer primary key, "
                + "Name Text Not Null, "
                + "IP1 integer Not Null, "
                + "IP2 integer Not Null, "
                + "IP3 integer Not Null, "
                + "IP4 integer Not Null, "
                + "Port integer Not Null"
                + ")";
        boolean lResult;

        try {
            lStm = mConn.createStatement();
            lStm.execute(lSql);
            lStm.close();
            lResult = true;
        } catch (SQLException ex) {
            mStatus = cSQL_error;
            mText = ex.getMessage();
            lResult = false;
        }
        return lResult;
    }

    private DbInternal sTestDB() {
        Statement lStm;
        ResultSet lRes;
        boolean lExist = false;
        int lCount;
        DbInternal lInternal = null;
        String lSql = "SELECT count(*) FROM sqlite_master WHERE type='table' AND name='Internal';";

        mText = "";
        if (mStatus == cOK) {
            try {
                lStm = mConn.createStatement();
                lRes = lStm.executeQuery(lSql);
                if (lRes.next()) {
                    lCount = lRes.getInt(1);
                    if (lCount > 0) {
                        lExist = true;
                    }
                }
                lRes.close();
                lStm.close();
            } catch (SQLException pExc) {
                mStatus = cSQL_error;
                mText = pExc.getMessage();
            }
        }
        if (lExist) {
            lInternal = sInternal();
        }
        return lInternal;
    }

    private DbInternal sInternal() {
        int lVersion;
        Statement lStm;
        ResultSet lRes;
        DbInternal lInternal = null;
        String lSql = "SELECT Version "
                + "FROM Internal "
                + "WHERE ID = 'NetworkTest';";

        mText = "";
        if (mStatus == cOK) {
            try {
                lStm = mConn.createStatement();
                lRes = lStm.executeQuery(lSql);
                if (lRes.next()) {
                    lVersion = lRes.getInt("Version");
                    lInternal = new DbInternal(lVersion);
                }
                lRes.close();
                lStm.close();
            } catch (SQLException pExc) {
                mStatus = cSQL_error;
                mText = pExc.getMessage();
            }
        }
        return lInternal;
    }

    public List<IPentry> xIPentries() {
        List<IPentry> lIPentries;
        IPentry lIPentry;
        int lIPid;
        String lName;
        int lIP1;
        int lIP2;
        int lIP3;
        int lIP4;
        int lPort;
        Statement lStm;
        ResultSet lRes;
        String lSql = "SELECT IPid, Name, IP1, IP2, IP3, IP4, Port "
                + "FROM IPaddress "
                + "ORDER BY Name;";

        lIPentries = new ArrayList<>();
        mText = "";
        if (mStatus == cOK) {
            try {
                lStm = mConn.createStatement();
                lRes = lStm.executeQuery(lSql);
                while (lRes.next()) {
                    lIPid = lRes.getInt("IPid");
                    lName = lRes.getString("Name");
                    lIP1 = lRes.getInt("IP1");
                    lIP2 = lRes.getInt("IP2");
                    lIP3 = lRes.getInt("IP3");
                    lIP4 = lRes.getInt("IP4");
                    lPort = lRes.getInt("Port");
                    lIPentry = new IPentry(lIPid, lName, lIP1, lIP2, lIP3, lIP4, lPort);
                    lIPentries.add(lIPentry);
                }
                lRes.close();
                lStm.close();
            } catch (SQLException ex) {
                mStatus = cSQL_error;
                mText = ex.getMessage();
            }
        }
        return lIPentries;
    }

    public void xNewIP(IPentry pEntry) {
        Statement lStm;
        String lSql;
        if (mStatus == cOK) {
            lSql = "INSERT INTO IPaddress (Name, IP1, IP2, IP3, IP4, Port) "
                    + "VALUES ('" + pEntry.xName() + "', "
                    + pEntry.xIP(0) + ", "
                    + pEntry.xIP(1) + ", "
                    + pEntry.xIP(2) + ", "
                    + pEntry.xIP(3) + ", "
                    + pEntry.xPort() + ");";
            try {
                lStm = mConn.createStatement();
                lStm.executeUpdate(lSql);
                lStm.close();
            } catch (SQLException ex) {
                mStatus = cSQL_error;
                mText = ex.getMessage();
            }
        }
    }

    public void xClose() {
        if (mConn != null) {
            try {
                mConn.close();
                mStatus = cNotSet;
            } catch (SQLException ex) {
                mText = ex.getMessage();
                mStatus = cError;
            }
        }
    }
}
