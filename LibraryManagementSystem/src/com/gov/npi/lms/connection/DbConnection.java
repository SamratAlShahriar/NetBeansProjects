package com.gov.npi.lms.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Samrat Al Shahriar
 */
public class DbConnection {

//    private static final String HOST = "jdbc:mysql://localhost:3306";
//    private static final String DBNMAE = "lmsdb";
//    private static final String URL = HOST + "/" + DBNMAE;
//    private static Connection con = null;
//    private static final String USERNAME="root";
//    private static final String PASSWORD="0000";
    
//    private static final String HOST = "jdbc:mysql://sql12.freesqldatabase.com:3306";
//    private static final String DBNMAE = "sql12219044";
//    private static final String URL = HOST + "/" + DBNMAE;
//    private static Connection con = null;
//    private static final String USERNAME = "sql12219044";
//    private static final String PASSWORD = "8G2WNrhrtz";
    
//    private static final String HOST = "jdbc:mysql://mrnax007.heliohost.org:3306";
//    private static final String DBNMAE = "mrnax007_lmsdb";
//    private static final String URL = HOST + "/" + DBNMAE;
//    private static Connection con = null;
//    private static final String USERNAME = "mrnax007_root";
//    private static final String PASSWORD = "00000";
    
    private static final String HOST = "jdbc:mysql://sql12.freemysqlhosting.net:3306";
    private static final String DBNMAE = "sql12219044";
    private static final String URL = HOST + "/" + DBNMAE;
    private static Connection con = null;
    private static final String USERNAME = "sql12219044";
    private static final String PASSWORD = "8G2WNrhrtz";

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("::Connected::");
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
