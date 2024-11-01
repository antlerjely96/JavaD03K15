import java.sql.*;

public class Product {
    //Attributes
    private int id;
    private String name;
    private double price;
    private int quantity;
    private int brandId;

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    //Method lấy toàn bộ product
    public void getProduct() throws SQLException {
        //Kết nối DB
        Connection connection = DatabaseConnection.openConnection();
        //Viết query
        String sql = "SELECT products.*, brands.name AS brand_name FROM products INNER JOIN brands ON products.brand_id = brands.id";
        //Chạy query
        Statement statement = connection.createStatement();
        ResultSet results = statement.executeQuery(sql);
        //Hiển thị kết quả
        while (results.next()) {
            //Lấy dữ liệu
            int id = results.getInt("id");
            String name = results.getString("name");
            double price = results.getDouble("price");
            int quantity = results.getInt("quantity");
            String brandName = results.getString("brand_name");
            System.out.println("Product id: " + id + ", product name: " + name + ", product price: " + price + ", product quantity: " + quantity + ", brand: " + brandName);
        }
        //Đóng kết nối
        DatabaseConnection.closeConnection(connection);
    }

    //Method thêm product
    public void addProduct() throws SQLException {
        //Mở kết nối
        Connection connection = DatabaseConnection.openConnection();
        //Lấy dữ liệu
        String name = this.name;
        double price = this.price;
        int quantity = this.quantity;
        int brandId = this.brandId;
        //Viết query
        String sql = "INSERT INTO products(name, price, quantity, brand_id) VALUES ('" + name + "', '" + price + "', '" + quantity + "', '" + brandId + "')";
        //Chạy query
        Statement statement = connection.createStatement();
        try {
            statement.executeUpdate(sql);
            System.out.println("Inserted product");
        } catch (SQLIntegrityConstraintViolationException ex){
            System.out.println("Insert failed");
        }
        //Đóng kết nối
        DatabaseConnection.closeConnection(connection);
    }

    //Method cập nhật product
    public void updateProduct(int id) throws SQLException {
        //Ket noi DB
        Connection connection = DatabaseConnection.openConnection();
        //Lay du lieu can update
        String name = this.name;
        double price = this.price;
        int quantity = this.quantity;
        int brandId = this.brandId;
        //Viet query
        String sql = "UPDATE products SET name = '" + name + "', price = '" + price + "', quantity = '" + quantity + "', brand_id = '" + brandId + "' WHERE id = '" + id + "'";
        //Chay query
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        //Dong ket noi
        DatabaseConnection.closeConnection(connection);
    }

    //Method xoa product
    public void deleteProduct(int id) throws SQLException {
        //Ket noi DB
        Connection connection = DatabaseConnection.openConnection();
        //Viet query
        String sql = "DELETE FROM products WHERE id = '" + id + "'";
        //Chay query
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        //Dong ket noi
        DatabaseConnection.closeConnection(connection);
    }

    //Method tim kiem product theo brand id
    public void searchProductByBrandId(int brandId) throws SQLException {
        //Ket noi DB
        Connection connection = DatabaseConnection.openConnection();
        //Viet Query
        String sql = "SELECT products.*, brands.name AS brand_name FROM products INNER JOIN brands" +
                " ON products.brand_id = brands.id WHERE products.brand_id = '" + brandId + "'";
        //Chay query
        Statement statement = connection.createStatement();
        ResultSet results = statement.executeQuery(sql);
        //Hien thi ket qua
        while (results.next()){
            int id = results.getInt("id");
            String name = results.getString("name");
            double price = results.getDouble("price");
            int quantity = results.getInt("quantity");
            String brandName = results.getString("brand_name");
            System.out.println("Product id: " + id + ", product name: " + name + ", product price: " + price + ", product quantity: " + quantity + ", brand: " + brandName);
        }
        //Dong ket noi
        DatabaseConnection.closeConnection(connection);
    }
}
