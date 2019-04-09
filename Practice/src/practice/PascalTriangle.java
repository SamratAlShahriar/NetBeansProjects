package practice;

import java.util.Scanner;

/**
 *
 * @author Nayeem
 */
public class PascalTriangle {

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        prln("Enter -1 to exit. ");
        prln("Give the length of pascal triangle");
        int userInput = myScanner.nextInt();
        while (userInput != -1) {
            if (userInput < -1 || userInput > 20) {
                prln("Please enter between -1 to 20");
                userInput = myScanner.nextInt();
                continue;
            }
            pascalTriangle(userInput);
            prln("\n\n");
            prln("Please enter between -1 to 20");
            userInput = myScanner.nextInt();
        }

    }

    public static void pascalTriangle(int length) {
        int[][] pascal = new int[length][length];

        //for assign value for 
        for (int i = 0; i < length; i++) {
            pascal[0][i] = 1;
            pascal[i][0] = 1;
        }

        //for assaign value
        for (int row = 1; row < length; row++) {
            for (int column = 1; column < length-row; column++) {
                pascal[row][column] = pascal[row][column - 1] + pascal[row - 1][column];
            }
        }

        //for print assaign value
        for (int row = 0; row < length; row++) {
            for (int column = 0; column < length-row; column++) {
                pr(pascal[row][column] + "\t");
            }
            prln("\n");
        }
    }

    public static void prln(Object anyObject) {
        System.out.println(anyObject);
    }

    public static void pr(Object anyObject) {
        System.out.print(anyObject);
    }
}
