import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String host = "jdbc:mysql://localhost:3306/product_manager";
    private static final String user = "root";
    private static final String password = "";

    //Tạo kết nối đến db
    public static Connection openConnection() throws SQLException {
            return DriverManager.getConnection(host, user, password);
    }

    public static void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }
}
