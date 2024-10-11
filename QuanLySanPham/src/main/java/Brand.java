import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Brand {
    //Attributes
    private int id;
    private String name;
    private String country;


    //Constructor
    public Brand(int id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public Brand(){

    }

    //Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    //Method để lấy dữ liệu từ db
    public void getBrand() throws SQLException {
        //Tao connection
        Connection connection = DatabaseConnection.openConnection();
        //Viết sql để lấy dữ liệu từ bảng brands
        String sql = "SELECT * FROM brands";
        //Tạo Statement
        Statement statement = connection.createStatement();
        //Chạy sql vừa viết
        ResultSet results = statement.executeQuery(sql);
        //Hiển thị được dữ liệu vừa lấy được
        while (results.next()){
            //Lấy id
            int id = results.getInt("id");
            //Lấy name
            String name = results.getString("name");
            //Lấy country
            String country = results.getString("country");
            //Hiển thị bản ghi vừa lấy được
            System.out.println("Brand id: " + id + ", brand name: " + name + ", brand country: " + country);
        }
        //Đóng kết nối
        DatabaseConnection.closeConnection(connection);
    }

    //Method để thêm mới một brand
    public void addBrand() throws SQLException {
        //Kết nối DB
        Connection connection = DatabaseConnection.openConnection();
        //Lấy dữ liệu được nhập vào từ bàn phím
        String name = this.name;
        String country = this.country;
        //Viết sql để thêm dữ liệu lên db
        String sql = "INSERT INTO brands(name, country) VALUES ('" + name + "', '" + country + "')";
        //Tạo Statement
        Statement statement = connection.createStatement();
        //Chạy sql
        statement.executeUpdate(sql);
        //Đóng kết nối
        DatabaseConnection.closeConnection(connection);
    }
}
