import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        //Tạo đối tượng brand
        Brand brand = new Brand();
//        System.out.println("Brand list before add new");
//        brand.getBrand();
//        System.out.println("--------------------------------");
//        //Nhập thông tin để thêm mới brand
//        System.out.println("Input brand information");
//        System.out.println("Input brand name: ");
//        brand.setName(scanner.nextLine());
//        System.out.println("Input brand country: ");
//        brand.setCountry(scanner.nextLine());
//        //Gọi method thêm
//        brand.addBrand();
//        System.out.println("--------------------------------");
//        System.out.println("Brand list after add new");
//        //Lấy toàn bộ bản ghi
//        brand.getBrand();
//        System.out.println("--------------------------------");
//        //Lấy toàn bộ brand
//        brand.getBrand();
//        //Nhập id để chọn brand được update
//        System.out.print("Select brand to update: ");
//        int idUpdate = scanner.nextInt();
//        //Nhập thông tin để update
//        System.out.println("Input update information");
//        System.out.print("Brand name: ");
//        scanner.nextLine(); // Skip newline character
//        String name = scanner.nextLine();
//        System.out.print("Brand country: ");
//        String country = scanner.nextLine();
//        brand.setName(name);
//        brand.setCountry(country);
//        //Gọi method update
//        brand.updateBrand(idUpdate);
//        System.out.println("List brand after update");
//        //Lấy toàn bộ brand
//        brand.getBrand();
        System.out.println("--------------------------------");
        //Lấy toàn bộ brand
        brand.getBrand();
        //Nhập id của bản ghi cần xóa
        System.out.print("Select id to delete: ");
        int idDelete = scanner.nextInt();
        //Gọi method delete
        brand.deleteBrand(idDelete);
        System.out.println("List brand after delete");
        //Lấy toàn bộ brand
        brand.getBrand();
    }
}
