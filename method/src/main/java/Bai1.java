import java.util.Scanner;

public class Bai1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //Nhập số nguyên n. Tính tổng các số từ 1 đến n
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
    //Method tính tổng
    public static void count(int n){
        //Khai báo biến tong
        int tong = 0;
        //Tính tổng các số từ 1 đến n
        for (int i = 0; i < n; i++){
            tong += i;
        }
        //In ra kết quả
        System.out.println("Tổng các số từ 1 đến n: " + tong);
    }
}
