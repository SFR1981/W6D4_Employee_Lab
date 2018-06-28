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

    public void setName(String newName) {
        if (name != null){
            this.name = newName;
        }else{
        }
    }

    public String getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary(double increase) {
        if (increase < 0) { return this.salary;
        } else {
            this.salary = this.salary + increase;
            return this.salary;
        }
    }

    public double payBonus(){
        return this.salary * 0.01;
    }
}
