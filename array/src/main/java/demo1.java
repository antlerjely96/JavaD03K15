import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        /* Nhập một mảng số nguyên có n phần tử.
        * n được nhập từ bàn phím
        * Hiển thị các phần tử của mảng
         */

        Scanner input = new Scanner(System.in);
        //Khai báo n
        int n;
        //Nhập n
        System.out.print("Nhập số phần tử của mảng: ");
        n = input.nextInt();
        //Khai báo mảng arr có n phần tử
        int[] arr = new int[n];
        //Nhập mảng tức là nhập giá trị cho từng phần tử của mảng => phải dùng vòng lặp chạy qua lần lượt các phần tử
        for(int i = 0; i < arr.length; i++){
            System.out.print("Nhập arr[" + i + "] = ");
            arr[i] = input.nextInt();
        }
        //Hiển thị mảng
        System.out.println("Các phần tử của mảng là:");
        for (int i = 0; i < arr.length; i++){
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}
