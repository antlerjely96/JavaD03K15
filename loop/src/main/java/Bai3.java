import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        //Nhập số nguyên a. Tính tổng các số chẵn từ 1 đến a
        Scanner input = new Scanner(System.in);
        //Nhập n
        int n;
        do{
            System.out.print("n = ");
            n = input.nextInt();
        } while(n < 1);
        //Khai báo result
        int result  = 0;
        //Tính tổng các số chẵn từ 1 đến n
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                result += i;
            }
        }
        System.out.println("Tổng các số chẵn trong từ 1 đến n: " + result);
    }
}
