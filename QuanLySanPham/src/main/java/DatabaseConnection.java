import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String host = "jdbc:mysql://localhost:3306/product_manager";
    private static final String user = "root";
    private static final String password = "";

    public Connection openConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(host, user, password);
            System.out.println("Kết nối database thành công");
        } catch (Exception e) {
            System.out.println("Kết nối database thất bại");
        }
        return connection;
    }

    public static void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }
}
