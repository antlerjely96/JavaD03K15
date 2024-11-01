import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);
    public static void menu() throws SQLException {
        //Tạo đối tượng brand
        Brand brand = new Brand();
        Product product = new Product();
        System.out.println("1. Brand list");
        System.out.println("2. Add a brand");
        System.out.println("3. Update a brand");
        System.out.println("4. Delete a brand");
        System.out.println("5. Search by id");
        System.out.println("6. Product List");
        System.out.println("7. Add a product");
        System.out.println("8. Update a product");
        System.out.println("9. Delete a product");
        System.out.println("10. Search by brand id");
        System.out.println("11. Cancel");
        int menu;
        do {
            System.out.print("Input a number in menu to select: ");
            menu = scanner.nextInt();
            switch (menu){
                case 1:
                    System.out.println("Brand list!");
                    brand.getBrand();
                    break;
                case 2:
                    System.out.println("Input brand information");
                    System.out.print("Input brand name: ");
                    scanner.nextLine();
                    brand.setName(scanner.nextLine());
                    System.out.print("Input brand country: ");
                    brand.setCountry(scanner.nextLine());
                    brand.addBrand();
                    System.out.println("Brand added!");
                    break;
                case 3:
                    //Lấy toàn bộ brand
                    brand.getBrand();
                    //Nhập id để chọn brand được update
                    System.out.print("Select brand to update: ");
                    int idUpdate = scanner.nextInt();
                    //Nhập thông tin để update
                    System.out.println("Input update information");
                    System.out.print("Brand name: ");
                    scanner.nextLine(); // Skip newline character
                    String name = scanner.nextLine();
                    System.out.print("Brand country: ");
                    String country = scanner.nextLine();
                    brand.setName(name);
                    brand.setCountry(country);
                    //Gọi method update
                    brand.updateBrand(idUpdate);
                    System.out.println("Brand updated!");
                    break;
                case 4:
                    //Lấy toàn bộ brand
                    brand.getBrand();
                    //Nhập id của bản ghi cần xóa
                    System.out.print("Select id to delete: ");
                    int idDelete = scanner.nextInt();
                    //Gọi method delete
                    brand.deleteBrand(idDelete);
                    System.out.println("Brand delete!");
                    break;
                case 5:
                    //Nhập id để tìm kiếm
                    System.out.print("Input id to search: ");
                    int idSearch = scanner.nextInt();
                    //Gọi method để search từ class Brand
                    brand.searchBrandById(idSearch);
                    break;
                case 6:
                    //Gọi method lấy toàn bộ product
                    System.out.println("Product list");
                    product.getProduct();
                    break;
                case 7:
                    //Nhap thong tin
                    System.out.println("Product information");
                    System.out.print("Input product name: ");
                    scanner.nextLine(); // Skip newline character
                    product.setName(scanner.nextLine());
                    System.out.print("Input product price: ");
                    product.setPrice(scanner.nextDouble());
                    System.out.print("Input product quantity: ");
                    product.setQuantity(scanner.nextInt());
                    System.out.println("Brand list: ");
                    brand.getBrand();
                    System.out.print("Select a brand: ");
                    product.setBrandId(scanner.nextInt());
                    //Gọi method thêm product
                    product.addProduct();
                    break;
                case 8:
                    //Lay toan bo product
                    product.getProduct();
                    //Yeu cau nhap id de update
                    System.out.print("Input product id to update: ");
                    int id = scanner.nextInt();
                    //Nhap thong tin de update
                    System.out.println("Product information");
                    System.out.print("Input product name: ");
                    scanner.nextLine(); // Skip newline character
                    product.setName(scanner.nextLine());
                    System.out.print("Input product price: ");
                    product.setPrice(scanner.nextDouble());
                    System.out.print("Input product quantity: ");
                    product.setQuantity(scanner.nextInt());
                    //Hien thi brand
                    brand.getBrand();
                    System.out.print("Input brand id: ");
                    product.setBrandId(scanner.nextInt());
                    //Goi method update
                    product.updateProduct(id);
                    System.out.println("Product updated!");
                    break;
                case 9:
                    //Lay toan bo product
                    product.getProduct();
                    //Yeu cau nhap id de xoa
                    System.out.print("Input product id to delete: ");
                    int idDeleteProduct = scanner.nextInt();
                    //Goi method delete
                    product.deleteProduct(idDeleteProduct);
                    System.out.println("Product deleted!");
                    break;
                case 10:
                    //Hien thi toan bo brand
                    brand.getBrand();
                    //Nhap id cua brand de tim kiem cac product cua brand do
                    System.out.print("Input brand id to search: ");
                    int idBrandSearch = scanner.nextInt();
                    //Goi method search
                    product.searchProductByBrandId(idBrandSearch);
                    break;
                case 11:
                    break;
                default:
                    System.out.println("Unknown action selected");
                    break;
            }
        } while (menu != 11);
    }
}
