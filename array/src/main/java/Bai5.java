import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        //Nhập mảng có n số thực. Sắp xếp mảng theo chiều giảm dần

        Scanner input = new Scanner(System.in);
        //Khai báo và nhập n
        System.out.print("n = ");
        int n = input.nextInt();
        //Khai báo mảng
        double [] arr = new double[n];
        //Nhập mảng
        for (int i = 0; i < n; i++){
            System.out.print("arr[" + i + "] = ");
            arr[i] = input.nextDouble();
        }
        //Khai báo biến temp;
        double temp;
        //Sắp xếp
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //Hiển thị mảng sau sắp xếp
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
