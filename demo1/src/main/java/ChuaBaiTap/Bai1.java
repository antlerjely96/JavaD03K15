package ChuaBaiTap;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        //Nhập 2 số nguyên a và b. Tính tổng, hiệu, tích, thương

        Scanner input = new Scanner(System.in);
        //Khai báo và nhập a
        System.out.print("a = ");
        int a = input.nextInt();
        //Khai báo và nhập b
        System.out.print("b = ");
        int b = input.nextInt();
        //Tính a + b
        int tong = a + b;
        //Hiển thị tổng
        System.out.println("a + b = " + tong);
        //Tính a - b
        int hieu = a - b;
        //Hiển thị hiệu
        System.out.println("a - b = " + hieu);
        //Tính a * b
        int tich = a * b;
        //Hiển thị tích
        System.out.println("a * b = " + tich);
        //Tính a/b
        //Kiểm tra b == 0?
        if(b == 0){
            System.out.println("Không chia được");
        } else {
            double thuong = (double) a / b;
            //Hiển thị thương
            System.out.println("a / b = " + thuong);
        }
    }
}
