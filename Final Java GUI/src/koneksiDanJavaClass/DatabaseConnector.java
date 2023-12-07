package koneksiDanJavaClass;

import java.sql.*;

public class DatabaseConnector {
    // JDBC database URL, username, and password
    private static final String connectionUrl = "jdbc:sqlserver://DESKTOP-V6OBS4E:1433;databaseName=cipungSquad;user=sa;password=123;encrypt=false;trustServerCertificate=false;loginTimeout=30;";

    public static Connection connection = null;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(connectionUrl);
            } catch (SQLException e) {
                e.printStackTrace();
                System.err.println("Connection LOST!!!");
            }
            finally{
                if(connection != null)
                System.out.println("Connection Succes :D");
                else
                System.out.println("Try Again");
            }
        }
        return connection;
    }

    public static void closeConnection(Connection connection) {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
