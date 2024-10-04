import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhập số phần tử");
        int n = nhapSoPhanTu();
        HinhChuNhat[] hinhChuNhat = new HinhChuNhat[n];
    }

    public static int nhapSoPhanTu(){
        int n = scanner.nextInt();
        return n;
    }
}
