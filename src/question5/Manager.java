package question5;

public class Manager extends Employee{
    protected String namedDepartment;

    public Manager(String name, double salary, String namedDepartment){
        super(name, salary);
        this.namedDepartment = namedDepartment;
    }

    public String getNamedDepartment(){
        return namedDepartment;
    }

    public String toString(){
        return name +  " " + namedDepartment + " " + salary;
    }
}
