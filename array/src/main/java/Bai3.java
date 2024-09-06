import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        //Nhập mảng số nguyên có n phần tử. Nhập số nguyên a. Tìm kiếm số lần xuất hiện của a trong mảng

        Scanner input = new Scanner(System.in);
        //Khai báo và nhập n
        System.out.print("Nhập số lượng phần tử: ");
        int n = input.nextInt();
        //Khai báo mảng
        int [] arr = new int[n];
        //Nhập mảng
        for (int i = 0; i < n; i++){
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
        //Khai báo và nhập a
        System.out.print("Nhập số cần tìm kiếm: ");
        int a = input.nextInt();
        //Khai báo biến đếm số lần xuất hiện của a
        int count = 0;
        //Tìm kiếm a
        for (int i = 0; i < n; i++){
            //Kiểm tra a có bằng phần tử của mảng không
            if(arr[i] == a){
                count++;
            }
        }
        //Hiển thị kết quả
        System.out.println("Số lần xuất hiện của a: " + count);
    }
}