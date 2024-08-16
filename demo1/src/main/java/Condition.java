import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        //Ví dụ 1
        /* Cho Một số nguyên a. Kiểm tra a có phải số dương không
        Nếu a là số dương thì hiển thị "a là số dương" */
        System.out.println("Ví dụ 1");
        //Khai báo biến a
        int a = 5;
        //Kiểm tra a > 0 hay không
        if(a > 0){
            //Hiển thị kết quả
            System.out.println("a là số nguyên dương");
        }
        System.out.println("-------------------");
        //Ví dụ 2
        /*
            Kiểm tra số nguyên b là số âm hay số dương.
            Hiển thị kết quả:
                Nếu b là số dương thì hiển thị "b là số dương"
                Còn lại: "b là số âm"
        */
        System.out.println("Ví dụ 2");
        //Khai báo b
        int b = -5;
        /* Kiểm tra điều kiện b > 0
            Nếu b > 0 mà true thì b dương
            Còn lại (b > 0 mà false) thì b âm
        */
        if(b > 0){
            System.out.println("b là số nguyên dương");
        } else {
            System.out.println("b là số nguyên âm");
        }
        System.out.println("------------------");

        //Ví dụ 3
        /*
            Kiểm tra số nguyên c là số âm hay dương
            Hiển thị:
                Nếu c > 0: "c là số dương"
                Nếu c < 0: "c là số âm"
                Còn lại: "c không phải số âm, không phải số dương"
        */
        System.out.println("Ví dụ 3");
        //Khai báo c
        int c = 0;
        //Kiểm tra
        if(c > 0){
            System.out.println("c là số nguyên dương");
        } else if (c < 0) {
            System.out.println("c là số nguyên âm");
        } else {
            System.out.println("c không phải số âm cũng không phải số dương");
        }
        System.out.println("-----------------");

        //Ví dụ 4:
        /*
            Kiểm tra số nguyên d.
            Nếu d là số nguyên dương thì kiểm tra d là số chẵn hay lẻ
            Hiển thị kết quả:
                Nếu d > 0:
                    Nếu d chẵn: "d là số nguyên dương chẵn"
                    Còn lại: "d là s nguyên dương lẻ"
                Nếu d < 0: "d là số nguyên âm"
                Còn lại: "d không phải số nguyên dương, không phải số nguyên âm"
        */
        System.out.println("Ví dụ 4");
        //Khai báo d
        int d = 100;
        //Kiểm tra d là số dương hay âm
        if(d > 0){
            //Kiểm tra d là số chẵn hay lẻ
            if(d % 2 == 0){
                System.out.println("d là số nguyên dương chẵn");
            } else {
                System.out.println("d là số nguyên dương lẻ");
            }
        }  else if(d < 0){
            System.out.println("d là số nguyên âm");
        } else {
            System.out.println("d không là số dương cũng không là số âm");
        }
        System.out.println("--------------------");

        //Ví dụ 5
        /*
            Nhập biến e. Hiển thị giá trị của e với điều kiện 0 <= e <= 10
        */
        System.out.println("Ví dụ 5");
        //Khai báo e
        int e;
        //Nhập e
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập e: ");
        e = input.nextInt();
        //Kiểm tra 0 <= e <= 1
        switch (e){
            case 0:
                System.out.println("e = 0");
                break;
            case 1:
                System.out.println("e = 1");
                break;
            case 2:
                System.out.println("e = 2");
                break;
            case 3:
                System.out.println("e = 3");
                break;
            case 4:
                System.out.println("e = 4");
                break;
            case 5:
                System.out.println("e = 5");
                break;
            case 6:
                System.out.println("e = 6");
                break;
            case 7:
                System.out.println("e = 7");
                break;
            case 8:
                System.out.println("e = 8");
                break;
            case 9:
                System.out.println("e = 9");
                break;
            case 10:
                System.out.println("e = 10");
                break;
            default:
                System.out.println("Chỉ nhập e trong khoảng từ 0 đến 10");
                break;
        }
    }
}
