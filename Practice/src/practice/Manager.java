package practice;

/**
 *
 * @author Nayeem
 */
public class Manager extends Employee {

    private String department;

    public Manager(String name, double salary, String dept) {
        super(name, salary);
        department = dept;
    }

    public Manager(String name, String dept) {
        super(name);
        department = dept;
    }

//    public Manager(String dept) { //this code fails: no super()
//        department = dept;
//    }

}
