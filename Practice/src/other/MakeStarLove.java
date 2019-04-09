package other;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nayeem
 */
public class MakeStarLove {
    
    
    public static void main(String args[]){
        int a, b, size = 15;
        
        /* FOR THE APEX OF HEART */
	for (a = size/2; a <= size; a = a+2)
	{
		// FOR SPACE BEFORE PEAK-1 : PART 1
		for (b = 1; b < size-a; b = b+2)	 
			print(" ");

		// FOR PRINTING PEAK-1 : PART 2
		for (b = 1; b <= a; b++)
			print("A");

		// FOR SPACE B/W PEAK-1 AND PEAK-2 : PART 3
		for (b = 1; b <= size-a; b++)
			print(" ");
		
		// FOR PRINTING PEAK-2 : PART 4
		for (b = 1; b <= a-1; b++)
			print("A");

		print("\n");
                
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MakeStarLove.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
        
        

	/*FOR THE BASE OF HEART ie. THE INVERTED TRIANGLE */

	for (a = size; a >= 0; a--)
	{
		// FOR SPACE BEFORE THE INVERTED TRIANGLE : PART 5 
		for (b = a; b < size; b++)
			print(" ");

		// FOR PRINTING THE BASE OF TRIANGLE : PART 6
		for (b = 1; b <= ((a * 2) - 1); b++)
			print("B");

		print("\n"); 
                
                try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MakeStarLove.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
    }
    
    public static void print(Object o){
        System.out.print(o);
    }
}
	

	
