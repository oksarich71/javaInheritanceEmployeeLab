package Management;

import Staff.Employee;

public class Director extends Employee {
    private double budget;
    public Director(String name, double salary, String numberNI, double budget){
        super(name, salary, numberNI);
        this.budget = budget;
    }
    public double getBudget(){
        return this.budget;
    }

    public double payBonus(){
        return salary * 0.02;
    }

}
