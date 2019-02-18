package Management;

public class Director extends Manager {


    private double budget;

    public Director(String name, String nationalInsurance, double salary, String department, double budget){
        super(name, nationalInsurance, salary, department);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
}
