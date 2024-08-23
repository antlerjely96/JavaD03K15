package ChuaBaiTap;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        //Nhập số nguyên month. Hiển thị số ngày của tháng n

        Scanner input = new Scanner(System.in);
        //Khai báo và nhập month
        System.out.print("month = ");
        int month = input.nextInt();
        //Khai báo và nhập year
        System.out.print("year = ");
        int year = input.nextInt();
        //Kiểm tra n
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + month + " có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + month + " có 30 ngày");
                break;
            case 2:
                if(year % 4 == 0){
                    System.out.println("Tháng " + month + " có 29 ngày");
                } else {
                    System.out.println("Tháng " + month + " có 28 ngày");
                }
                break;
            default:
                System.out.println("Không tồn tại tháng vừa nhập");
                break;
        }
    }
}
