package staff.management;

public class Director extends Manager {

    double budget;

    public Director(String name, String niNumber, double salary, String department, double budget) {
        super(name, niNumber, salary, department);
        this.budget = budget;
    }



    public double getBudget() {
        return budget;
    }

    public double payBonus(){
       return  super.getSalary() * 0.02;
    }
}
