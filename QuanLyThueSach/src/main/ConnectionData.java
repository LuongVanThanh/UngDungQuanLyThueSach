
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Quang Minh
 */
public class ConnectionData {
    
    private static final String connectionURL ="jdbc:sqlserver://localhost;databaseName=Book;user=sa;password=";
    
    public static Connection ConnectionTest() throws ClassNotFoundException {
        Connection conn = null;
  try {
    Class.forName("com.microsoft.sqlsever.jdbc.SQLSeverDriver");
    conn = DriverManager.getConnection(connectionURL);
   } catch (SQLException ex) {
       return null;
   }
    return conn;
  }
}
