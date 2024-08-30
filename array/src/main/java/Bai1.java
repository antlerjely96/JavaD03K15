import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        //Nhập mảng có n số thực. Tính tổng các phần tử
        int n;
        //Scanner
        Scanner input = new Scanner(System.in);
        //Khai báo n
        System.out.print("Nhap so thuc n la: ");
        //Nhập n
        n= input.nextInt();
        //Khai báo mảng
        int[] arr= new int[n];
        //Nhập mảng
        for (int i=0; i<n; i++){
            System.out.print("Nhap arr [" + i +"]= ");
            arr[i]= input.nextInt();
        }
        //Khai báo tổng
        int sum=0;
        //Tính tổng
        for (int i=0; i<n; i++){
            sum+=arr[i];
        }
        //Hiện kết quả
        System.out.println(" Tong cua cac song tren mang là: "+sum);
    }
}
