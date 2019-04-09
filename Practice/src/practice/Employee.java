package practice;

import java.util.Date;

/**
 *
 * @author Nayeem
 */
public class Employee {

    private static final double BASE_SALARY = 15202.0;
    String name;
    private double salary;
    private Date birthDate;

    public Employee(String name, double salary, Date birthDate) {
        this.name = name;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    public Employee(String name, double salary) {
        this(name, salary, null);
    }

    public Employee(String name, Date dateOfBirth) {
        this(name, BASE_SALARY, dateOfBirth);
    }

    public Employee(String name) {
        this(name, BASE_SALARY);
    }
        //more Employee code
}
