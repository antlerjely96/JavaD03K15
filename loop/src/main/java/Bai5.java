public class Bai5 {
    public static void main(String[] args) {
        /* Vẽ hình
            *
            *   *
            *   *   *
            *   *   *   *
            *   *   *   *   *
        */
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
