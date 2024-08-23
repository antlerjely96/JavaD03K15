import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        //Nhập số nguyên n
        //a. Kiểm tra n có phải số nguyên tố không
        //b. Hiển thị các số nguyên tố từ 1 đến n

        Scanner input = new Scanner(System.in);
        //Khai báo n
        int n;
        //Nhập n
        System.out.print("n = ");
        n = input.nextInt();
        /* a. */
        //Khai báo biến count
        int count = 0;
        //Kiểm tra n có chia hết cho số nào  2 đến n không, nếu n chia hết cho 1 số nào đó thì count + 1
        for (int i = 2; i < n; i++){
            if(n % i == 0){
                count++;
            }
        }
        //Kiểm tra nếu count != 0 thì n không phải số nguyên tố
        if(count != 0){
            System.out.println(n + " không phải số nguyên tố");
        } else {
            System.out.println(n + " là số nguyên tố");
        }
        /* b */
        System.out.println("Các số nguyên tố trong khoảng từ 1 đến " + n + ":");
        //Khai báo 1 biến countTemp
        int countTemp;
        //Chạy vòng lặp để kiểm tra từng số từ 2 đến n có phải số nguyên tố không
        for(int i = 2; i < n; i++){
            countTemp = 0;
            //Chạy vòng lặp để kiểm tra i có phải số nguyên tố không
            for(int j = 2; j < i; j++){
                //Kiểm tra nếu i chia hết cho j thì countTemp + 1
                if(i % j == 0){
                    countTemp++;
                }
            }
            //Kiểm tra nếu countTemp == 0 thì in ra i
            if(countTemp == 0){
                System.out.println(i);
            }
        }
    }
}
