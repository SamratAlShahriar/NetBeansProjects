package other;

/**
 *
 * @author Nayeem
 */
public class PrintStar {

    public static void main(String args[]) {
        int i = 0;

        if (i < 6) {
            for (i = 0; i < 6; i++) {

                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        if (i > 5) {
            for (i = 5; i > 0; i--) {

                for (int j = i; j > i; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
