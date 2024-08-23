public class Bai6 {
    public static void main(String[] args) {
        /*Vẽ hình
            1   2   3   4   5
            1   2   3   4
            1   2   3
            1   2
            1
        */
        for(int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i + 1; j++) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}
