package staff;

public abstract class  Employee {
    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary(double increase){
        this.salary = this.salary + increase;
        return this.salary;
    }

    public double payBonus(){
        return this.salary * 0.01;
    }
}
