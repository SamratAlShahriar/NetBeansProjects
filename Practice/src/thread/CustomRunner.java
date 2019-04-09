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
public class CustomRunner implements Runnable {

    public CustomRunner() {
    }

    @Override
    public void run() {

        while (true) {
            System.out.println("mm");
            try {
                Thread.sleep(1000);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
