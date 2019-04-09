package practice;

import javax.swing.JOptionPane;

public class ClassNameHere
{

    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void showMessage(String popUpMsg ) {
    JOptionPane.showMessageDialog(null, popUpMsg);
    }

    
}
