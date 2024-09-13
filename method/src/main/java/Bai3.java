import java.util.Scanner;

public class Bai3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //Nhập mảng số thực có n phần tử. Tìm min, max
        int n = inputN();
        double[] arr = inputArray(n);
        searchMin(arr, n);
        searchMax(arr, n);

    }
    //Method nhập n
    public static int inputN(){
        //Khai báo n
        int n;
        //Nhập n
        System.out.print("n = ");
        n = scanner.nextInt();
        //Trả về n
        return n;
    }
    //Method nhập mảng
    public static double[] inputArray(int n){
        //Khai báo mảng
        double[] arr = new double[n];
        //Nhập mảng
        for (int i = 0; i < n; i++){
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextDouble();
        }
        //Trả về mảng
        return arr;
    }
    //Method tìm min
    public static void searchMin(double[] arr, int n){
        //Khai báo min
        double min = arr[0];
        //Tìm min
        for (int i = 0; i < n; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        //In ra kết quả
        System.out.println("Min = " + min);
    }
    //Method tìm max
    public static void searchMax(double[] arr, int n){
        //Khai báo max
        double max = arr[0];
        //Tìm max
        for (int i = 0; i < n; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        //Trả về kết quả
        System.out.println("Max = " + max);
    }
}
