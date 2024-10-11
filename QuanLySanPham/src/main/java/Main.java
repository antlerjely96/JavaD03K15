import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        //Tạo đối tượng brand
        Brand brand = new Brand();
        System.out.println("Brand list before add new");
        brand.getBrand();
        System.out.println("--------------------------------");
        System.out.println("Input brand information");
        System.out.println("Input brand name: ");
        brand.setName(scanner.nextLine());
        System.out.println("Input brand country: ");
        brand.setCountry(scanner.nextLine());
        brand.addBrand();
        System.out.println("--------------------------------");
        System.out.println("Brand list after add new");
        brand.getBrand();
    }
}
