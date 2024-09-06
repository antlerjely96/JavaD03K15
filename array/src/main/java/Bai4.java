import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        //Nhập mảng số nguyên có n phần tử. Tìm min, max. Tính max!

        Scanner input = new Scanner(System.in);
        //Khai báo và nhập n
        System.out.print("n = ");
        int n = input.nextInt();
        //Khai báo mảng
        int [] arr = new int[n];
        //Nhập mảng
        for (int i = 0; i < n; i++){
            System.out.print("arr[" + i + "] = ");
            arr[i] = input.nextInt();
        }
        //Khai báo min và gán bằng phần tử đầu tiên của mảng
        int min = arr[0];
        //So sánh lần lượt min với các phần tử của mảng
        for(int i = 0; i < n; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        //Hiển thị min
        System.out.println("min = " + min);
        //Khai báo max và gán bằng phần tử đầu tiên của mảng
        int max = arr[0];
        //So sánh lần lượt max với các phần tử của mảng
        for(int i = 0; i < n; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        //In ra max
        System.out.println("max = " + max);
        //Khai báo biến gt
        int gt = 1;
        //tính max!
        if(max < 0){
            System.out.println("Không tính được max!");
        } else if (max == 0) {
            System.out.println("max! = 1");
        } else {
            for (int i = 1; i <= max; i++){
                gt *= i;
            }
            System.out.println("max! = " + gt);
        }


    }
}
