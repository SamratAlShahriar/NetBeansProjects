/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package other;

/**
 *
 * @author Nayeem
 */

 
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.Timer;


public class Clk extends javax.swing.JFrame {

// label to font size ratio will be stored here
    float width2sizeRatio;

    /**
     * Creates new form DesktopTime
     */
    public Clk() {
        initComponents();
        // creates a timer which calls getTime() method every 1 second
        Timer tm = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getTime();
            }
        });
        tm.setRepeats(true);
        tm.setDelay(1000);
        tm.start();

        //get initial width to font size ratio
        int fontSize = timeLabel.getFont().getSize();
        int labelWidth = timeLabel.getWidth();
        width2sizeRatio = fontSize / (float) labelWidth;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        timeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(252, 252, 252));
        setFocusCycleRoot(false);
        setFocusable(false);
        setFocusableWindowState(false);
        setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        setForeground(new java.awt.Color(0, 0, 0));
        setMaximumSize(null);
        setMinimumSize(new java.awt.Dimension(355, 100));
        setType(java.awt.Window.Type.UTILITY);

        timeLabel.setBackground(new java.awt.Color(0, 0, 0));
        timeLabel.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(255, 0, 51));
        timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel.setText("00 : 00 : 00 ");
        timeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        timeLabel.setFocusable(false);
        timeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        timeLabel.setInheritsPopupMenu(false);
        timeLabel.setMinimumSize(new java.awt.Dimension(355, 70));
        timeLabel.setName(""); // NOI18N
        timeLabel.setOpaque(true);
        timeLabel.setRequestFocusEnabled(false);
        timeLabel.setVerifyInputWhenFocusTarget(false);
        timeLabel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                timeLabelComponentResized(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(timeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(timeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        timeLabel.getAccessibleContext().setAccessibleName("");
        timeLabel.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>

    /**
     * this method is called when the window is resize
     */
    private void timeLabelComponentResized(java.awt.event.ComponentEvent evt) {

        updateFontSize();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Clk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clk().setVisible(true);

            }
        });

    }

    private void getTime() {
       //get time from system
        Calendar cld = Calendar.getInstance();
        int hour = cld.get(Calendar.HOUR);
        hour = hour == 0 ? 12 : hour;
        int min = cld.get(Calendar.MINUTE);
        int sec = cld.get(Calendar.SECOND);
        String noon = cld.getDisplayName(Calendar.AM_PM, Calendar.LONG_FORMAT,
                Locale.ENGLISH);
        String weekDay = cld.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG,
                Locale.ENGLISH);
        int day = cld.get(Calendar.DATE);
        int month = cld.get(Calendar.MONTH);
        int year = cld.get(Calendar.YEAR);
        String formatTime = hour + " : " + min + " : " + sec + " " + noon;
        timeLabel.setText(formatTime);

    }

    private void updateFontSize() {
        Font font = timeLabel.getFont();
        float newWidth = timeLabel.getWidth();
        font = font.deriveFont(font.getStyle(), newWidth * width2sizeRatio);
        timeLabel.setFont(font);
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel timeLabel;
    // End of variables declaration

}