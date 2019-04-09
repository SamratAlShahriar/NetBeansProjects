
package newpackage;

public class Employ {
    
    private String name;
    private int age;
    private double salary;
    private Department department;

    public Employ(String name, int age, double salary, Department department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public Department getDepartment() {
        return department;
    }
    
    
}
