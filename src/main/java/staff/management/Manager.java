package staff.management;

import staff.Employee;

public class Manager extends Employee {

    String department;

    public Manager(String name, String niNumber, double salary, String department) {
        super(name, niNumber, salary);
        this.department = department;
    }

    public String getDepartment() {
        return this.department;
    }
}
