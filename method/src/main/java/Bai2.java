import java.util.Scanner;

public class Bai2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //Nhập số nguyên n. Tính n!
        int n = input();
        count(n);
    }
    //Method nhập n
    public static int input(){
        //Khai báo n
        int n;
        //Nhập n
        System.out.print("n = ");
        n = scanner.nextInt();
        //Trả về n
        return n;
    }
    //Method tính giai thừa
    public static void count(int n){
        //Khai báo gt = 1
        int gt = 1;
        //Tính n!
        if (n < 0){
            System.out.println("Không tính được n!");
        } else if (n == 0) {
            System.out.println("n! = 1");
        } else {
            for (int i = 1; i <= n; i++){
                gt *= i;
            }
            System.out.println("n! = " + gt);
        }
    }
}
