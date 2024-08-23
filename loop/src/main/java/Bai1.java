import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        //Nhập số nguyên n. Tính tổng các số từ 1 đến n
        Scanner input = new Scanner(System.in);
        //Khai báo n
        int n;
        //Nhập n. Nếu n < 1 thì nhập lại
        do {
            System.out.print("Nhập n = ");
            n = input.nextInt();
        } while (n < 1);
        //Khai báo sum
        int sum = 0;
        //Tính tổng các số từ 1 đến n
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        //In ra kết quả
        System.out.println("Tổng các số từ 1 đến " + n + " : " + sum);

    }
}
