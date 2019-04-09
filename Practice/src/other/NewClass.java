package other;

import java.util.Random;

/**
 *
 * @author Nayeem
 * @param <T>
 */
public class NewClass <T extends Number>{
    
    
    
    
    public static void main(String[] args) {
        String[] number = {"1", "3", "2"};
        int a = number.length;
        
        Random random = new Random();
        int nextInt = random.nextInt(1005);
        System.out.println(nextInt);
        System.out.println();
        System.out.println();
    }
   
    
}
