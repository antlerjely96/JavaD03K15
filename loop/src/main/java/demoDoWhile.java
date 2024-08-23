import java.util.Scanner;

public class demoDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //In ra các số liên tiếp từ 1 đến 10
        int i = 1;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 10);

        //Nhập số nguyên n. Nếu n > 10 thì nhập lại. In ra các số từ n đến 10
        int n;
        do {
            System.out.print("Nhập n: ");
            n = input.nextInt();
        } while (n > 10);
        for (int j = n; j < 10; j++) {
            System.out.println("j = " + j);
        }
    }
}
