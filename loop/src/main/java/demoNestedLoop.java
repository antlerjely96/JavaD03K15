public class demoNestedLoop {
    public static void main(String[] args) {
        // in ra ma trận
        /*
        1   2   3   4   5
        1   2   3   4   5
        1   2   3   4   5
        1   2   3   4   5
        1   2   3   4   5
        * */
        for(int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}
