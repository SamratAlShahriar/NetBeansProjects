package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Nayeem
 */
public class ContinueStatement {

    public static void main(String[] args) throws IOException {
        int number = 0;
        String s;
        for (;;) {
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            System.out.print("Enter a positive number: ");
            s = br.readLine();
            number = Integer.parseInt(s);
            if (number <= 0) {
                continue;
            } else {
                break;
            }

        } //end of for
        System.out.print("You have entered: " + number);
    }

}
