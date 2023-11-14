package question4;
import java.util.Date;

public class Student extends Person {
    String major;

    public Student(String name, Date yearOfBirth, String major){
        super(name, yearOfBirth);
        this.major =  major;
    }

    public String getMajor(){
        return major;
    }
}
