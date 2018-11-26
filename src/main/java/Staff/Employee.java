package Staff;

public class Employee {
    public String name;
    public double salary;
    public String numberNI;

    public Employee(String name, double salary, String numberNI){
        this.name = name;
        this.salary = salary;
        this.numberNI = numberNI;
    }

    public String getName(){return this.name;}

    public double getSalary(){return this.salary;}

    public String getNumberNI(){return this.numberNI;}

    public double raiseSalary(double raise){
        return salary + raise;
    }

    public double payBonus() {
        return salary * .01; }

//

    }




