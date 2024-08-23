package ChuaBaiTap;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        /* Nhập 2 số nguyên a và b
            Nếu a > b thì tính q = a * 3 + b^2 - (a * b)
            Nếu a < b thì tính p = sqrt(a * b) / (a - b) + a / b
            Còn lại tính sqrt(a^3 + b^3)
         */

        Scanner input = new Scanner(System.in);
        //Khai báo và nhập a
        System.out.print("a = ");
        int a = input.nextInt();
        //Khai báo và nhập b
        System.out.print("b = ");
        int b = input.nextInt();
        if(a < b){
            double q = a * 3 + Math.pow(b, 2) - (a * b);
            System.out.println("q = " + q);
        } else if(a > b){
            double p = Math.sqrt(a * b) / (a - b) + (double) a / b;
            System.out.println("p = " + p);
        } else {
            double r = Math.sqrt(Math.pow(a, 3) + Math.pow(b, 3));
            System.out.println("r = " + r);
        }
    }
}
