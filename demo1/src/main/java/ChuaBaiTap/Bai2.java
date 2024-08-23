package ChuaBaiTap;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        //Nhập 3 số thực a, b, c. Kiểm tra a, b, c có phải 3 cạnh tam giác không

        Scanner input = new Scanner(System.in);
        //Khai báo và nhập a
        System.out.print("a = ");
        double a = input.nextDouble();
        //Khai báo và nhập b
        System.out.print("b = ");
        double b = input.nextDouble();
        System.out.print("c = ");
        double c = input.nextDouble();
        //Kiểm tra a, b, c > 0
        if(a > 0 && b > 0 && c > 0){
            if(a + b > c && b + c > a && a + c > b){
                System.out.println("a, b, c tạo thành tam giác");
            } else {
                System.out.println("a, b, c không tạo thành tam giác");
            }
        } else {
            System.out.println("a, b, c không tạo thành tam giác");
        }
    }
}
