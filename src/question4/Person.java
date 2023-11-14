package question4;
import java.util.Date;

public class Person {
    private String name;
    private Date yearOfBirth;

    public Person(String name, Date yearOfBirth){
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName(){
        return name;
    }

    public Date getYearofBirth(){
        return yearOfBirth;
    }
    
}

