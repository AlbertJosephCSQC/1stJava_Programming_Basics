public class StarLoops {
    public static void main(String[] args) {

        int i, j;
        /* Writ your answer here */

        for (i = 7; i >= 1; i--) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
