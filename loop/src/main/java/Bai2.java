import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        //Nhập số nguyên n. Tính n!
        Scanner input = new Scanner(System.in);
        // Khai báo n
        int n;
        //Nhập n
        System.out.print("n = ");
        n = input.nextInt();
        //Kiểm tra n
        if (n < 0){
            System.out.println("Không tính được n!");
        } else if (n == 0) {
            System.out.println("n! = 1");
        } else {
            //Khai báo biến gt
            int gt = 1;
            //Chạy vòng lặp để tính n!
            for(int i = 1; i <= n; i++){
                gt *= i;
            }
            //In ra kết quả
            System.out.println("n! = " + gt);
        }

    }
}
