package info.nayeem.sim.connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nayeem
 */
public class Connection {

    private static final String HOST = "jdbc:mysql://localhost:3306";
    private static final String DBNAME = "sim_info";
    private static final String URL = HOST + "/" + DBNAME;

    private static Connection conn = null;
    private static final String USERNAME = "root";
    private static final String PASSWORD = "0000";

    public static Connection getDBConnection() {
        try {
            conn = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}
