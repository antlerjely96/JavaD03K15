import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Tạo đối tượng scanner để nhập dữ liệu
        Scanner scanner = new Scanner(System.in);
        //Tạo đối tượng của class Human
        Human human1 = new Human();
        //Nhập thông tin cho attribute name của Object human1
        System.out.print("Input name: ");
        human1.name = scanner.nextLine();
        //Nhập thông tin cho attribute age của Object human1
        System.out.print("Input age: ");
        human1.age = scanner.nextInt();
        //Nhập thông tin cho attribute phone của Object human1
        System.out.print("Input phone: ");
        scanner.nextLine();
        human1.phone = scanner.nextLine();
        //Gọi phương thức display của human1
        System.out.println("Information: ");
        human1.display();
        Human human2 = new Human();
    }
}
