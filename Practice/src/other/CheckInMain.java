package other;

/**
 *
 * @author Nayeem
 */
public class CheckInMain {

    public static void main(String args[]) {
        System.out.println(rollDice(5));
        checkSpace(               );

    }

    public static int rollDice(int sides) {
        double randomNumber = Math.random();
        randomNumber *= sides;
        randomNumber += 1;
        return (int) randomNumber;
    }
    
    
    public static void checkSpace() {
        System.out.println("ok");
    }
}
