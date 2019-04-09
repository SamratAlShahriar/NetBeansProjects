/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author Nayeem
 */
public class Runner {

    public static void main(String... args) {
        CustomRunner customRunnable = new CustomRunner();
        Thread thread = new Thread(customRunnable);
        thread.start();
    }
}
