package other;

import java.util.Scanner;

public class SubString {

    private static Scanner scanner = new Scanner(System.in);
    private static Scanner scanner2 = new Scanner(System.in);
    private static int tCase = 0;

    public static void main(String[] args) {
        new SubString().checkString();
        scanner.close();
        scanner2.close();
    }

    public void checkString() {
        tCase = scanner.nextInt();
        while (tCase > 0) {
            String text = scanner2.nextLine().toLowerCase();
            String pat = scanner2.nextLine().toLowerCase();

            if (text.contains(pat)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            tCase--;
        }
    }
}
