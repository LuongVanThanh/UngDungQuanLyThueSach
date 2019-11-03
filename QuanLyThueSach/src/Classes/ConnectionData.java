  package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Quang Minh
 */
public class ConnectionData {

    private static final String connectionURL = "jdbc:sqlserver://localhost;databaseName=Book;user=sa;password=123";

    public static Connection ConnectionTest() throws ClassNotFoundException {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(connectionURL);
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        return conn;
    }
}
