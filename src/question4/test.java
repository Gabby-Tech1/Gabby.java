package question4;
;

public class test {
     public static void main(String[] args) {
        Student student = new Student("Gabby Addo", 2004, "Computer Science");
        Instructor instructor = new Instructor("Mark Atta Mensah", 1973, 49067);

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Year of Birth: " + student.getYearofBirth());
        System.out.println("Student Major: " + student.getMajor());
        System.out.println("Instructor Name: " + instructor.getName());
        System.out.println("Instructor Year of Birth: " + instructor.getYearofBirth());
        System.out.println("Instructor Salary: " + instructor.getSalary());

    }
    
}
