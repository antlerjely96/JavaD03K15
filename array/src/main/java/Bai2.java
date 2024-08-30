import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        //Nhập mảng có n số nguyên. Tính tích các phần tử có giá trị chẵn

        //Scanner
           Scanner input = new Scanner(System.in);
        //Khai báo n
           System.out.print("Nhap chieu dai cua mang: ");
        //Nhập n
          int n = input.nextInt();
        //Khai báo mảng
          int[] arr = new int[n];
        //Nhập mảng
          for(int i = 0; i < n; i++){
              System.out.print("Nhap phan tu thu " + i + " ");
              arr[i] =  input.nextInt();
          }
        //Khai báo tích
        int tich = 1;
        //Tính tích các số có giá trị chẵn
        for(int i = 0; i < n; i++){
          if(arr[i] % 2 ==0){
              tich *= arr[i];
          }
        }
        //Hiển thị kết quả
        System.out.print("Tich cua mang la: " + tich);
    }
}
