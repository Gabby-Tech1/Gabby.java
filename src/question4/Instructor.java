package question4;
import java.util.Date;

public class Instructor extends Person{
    double salary;

    public Instructor(String name, Date yearOfBirth, double salary){
        super(name, yearOfBirth);
        this.salary = salary;
    }

    public double getSalary(){
        return salary;

    }

}
