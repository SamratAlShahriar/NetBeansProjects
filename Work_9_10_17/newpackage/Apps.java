/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author DBA
 */
public class Apps {

    public static void main(String args[]) {
        
        Employ employ = new Employ("anik", 20, 50000,new Department("PHP"));
        System.out.println("Name: "+employ.getName());
        System.out.println("Age: "+employ.getAge());
        System.out.println("Salary: "+employ.getSalary());
        System.out.println("Deparment: "+employ.getDepartment().getName());
        
    }
}
