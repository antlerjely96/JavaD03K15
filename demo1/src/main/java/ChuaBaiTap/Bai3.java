package ChuaBaiTap;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        //Nhập 3 số nguyên a, b, c. Tính nghiệm phương trình ax^2 + bx + c = 0

        Scanner input = new Scanner(System.in);
        //Khai báo và nhập a
        System.out.print("a = ");
        int a = input.nextInt();
        //Khai báo và nhập b
        System.out.print("b = ");
        int b = input.nextInt();
        System.out.print("c = ");
        int c = input.nextInt();
        //Kiểm tra a == 0?
        if (a == 0) {
            //Kiểm tra b == 0?
            if (b == 0) {
                //Kiểm tra c == 0?
                if (c == 0){
                    System.out.println("Phương trình vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                double x = (double) (-c) / b;
                System.out.println("Phương trình có nghiệm x = " + x);
            }
        } else {
            //Tính delta
            double delta =  Math.pow(b, 2) - 4 * a * c;
            //Kiểm tra delta
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                double x = (double) (-b) / (2 * a);
                System.out.println("Phương trình có nghiệm x = " + x);
            } else {
                double x1 = ((double) (-b) + Math.sqrt(delta)) / (2 * a);
                double x2 = ((double) (-b) - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm: x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }
}
