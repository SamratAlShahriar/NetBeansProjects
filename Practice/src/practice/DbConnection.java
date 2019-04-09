package practice;

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

    private static final String HOST = "jdbc:mysql://localhost:3306";
    private static final String DBNMAE = "lmsdb";
    private static final String URL = HOST + "/" + DBNMAE;
    private static Connection con = null;
    private static final String USERNAME="root";
    private static final String PASSWORD="0000";

    public static Connection getConnection() {
        try {
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("::Connected::");
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
