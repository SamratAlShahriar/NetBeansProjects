package com.gov.npi.lms.mainpage;

import com.gov.npi.lms.view.LoadingForm;
import com.gov.npi.lms.view.LoginForm;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author www.facebook.com/Md.SamratAlShahriar.Nayeem
 */
public class LoadingMainPage {

    static LoginForm loginForm = new LoginForm();
    static LoadingForm loading = new LoadingForm();

    public static void main(String args[]) {
        loading.setVisible(true);
        loadingLoop();
        loading.setVisible(false);
        loginForm.setVisible(true);
    }

    public static void loadingLoop() {

        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(50);
                loading.lblLoading.setText(Integer.toString(i) + "%");
                loading.progressBarLoading.setValue(i);
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(LoadingMainPage.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
