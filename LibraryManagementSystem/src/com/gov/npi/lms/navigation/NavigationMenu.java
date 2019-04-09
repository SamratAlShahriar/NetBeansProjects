package com.gov.npi.lms.navigation;

import com.gov.npi.lms.view.BookInformationForm;
import com.gov.npi.lms.view.BookIssueReturnForm;
import com.gov.npi.lms.view.BookSummaryForm;
import com.gov.npi.lms.view.CreateUserForm;
import com.gov.npi.lms.view.DashboardForm;
import com.gov.npi.lms.view.LoginForm;
import com.gov.npi.lms.view.SearchForm;
import com.gov.npi.lms.view.StudentForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author MSAS Nayeem
 */
public class NavigationMenu {

    public NavigationMenu() {
    }

    // Making a Common menu for all window
    public static JMenuBar commonNavMenu(JFrame jf) {
        JMenuBar navBar = new JMenuBar();

        JMenu navMenu = new JMenu("Navigation");    //Menu

        JMenuItem menuItem1 = new JMenuItem("Dashboard");   //Submenu of Dashboard
        menuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jf.setVisible(false);
                new DashboardForm().setVisible(true);
            }
        });

        JMenuItem menuItem2 = new JMenuItem("Book Information");   //Submenu of Dashboard
        menuItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jf.setVisible(false);
                new BookInformationForm().setVisible(true);
            }
        });

        JMenuItem menuItem3 = new JMenuItem("Book Issue Or Return");   //Submenu of Dashboard
        menuItem3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jf.setVisible(false);
                new BookIssueReturnForm().setVisible(true);
            }
        });

        JMenuItem menuItem4 = new JMenuItem("Book Summary");   //Submenu of Dashboard
        menuItem4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jf.setVisible(false);
                new BookSummaryForm().setVisible(true);
            }
        });

        JMenuItem menuItem5 = new JMenuItem("Search");   //Submenu of Dashboard
        menuItem5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jf.setVisible(false);
                new SearchForm().setVisible(true);
            }
        });

        JMenuItem menuItem6 = new JMenuItem("Student Information");   //Submenu of Dashboard
        menuItem6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jf.setVisible(false);
                new StudentForm().setVisible(true);
            }
        });
        //adding submenu in main menu(Navigation)
        navMenu.add(menuItem1);
        navMenu.add(menuItem2);
        navMenu.add(menuItem3);
        navMenu.add(menuItem4);
        navMenu.add(menuItem5);
        navMenu.add(menuItem6);

        JMenu navToolsMenu = new JMenu("CPanel");   //Menu

        JMenuItem menuToolsItem1 = new JMenuItem("Create User");   //Submenu of CPanel
        menuToolsItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jf.setVisible(false);
                new CreateUserForm().setVisible(true);
            }
        });

        JMenuItem menuToolsItem2 = new JMenuItem("Logout");   //Submenu of CPanel
        menuToolsItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jf.setVisible(false);
                new LoginForm().setVisible(true);
            }
        });
        //adding submenu in main menu(CPanel)
        navToolsMenu.add(menuToolsItem1);
        navToolsMenu.add(menuToolsItem2);

        navBar.add(Box.createHorizontalGlue()); //add a Horizontal glue to stack menubar in right

        //adding menu in menubar(Navigation and CPanel)
        navBar.add(navMenu);
        navBar.add(navToolsMenu);

        return navBar;
    }

}
