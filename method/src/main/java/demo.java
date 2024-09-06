import java.util.Scanner;

public class demo {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int a = input();
        display(a);
    }
    //Khai báo method hiển thị a
    public static void display(int a){
        System.out.println("a = " + a);
    }
    //Khai báo method nhập a
    public static int input(){
        //Khai báo và nhập a
        int a = input.nextInt();
        return a;
    }

}
