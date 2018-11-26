package Management;

public class Manager extends Staff.Employee {
    public String depName;

    public Manager(String depName, String name, double salary, String numberNI){
        super(name, salary, numberNI);
        this.depName = depName;
    }

    public String getDepName(){
        return this.depName;
    }
}
