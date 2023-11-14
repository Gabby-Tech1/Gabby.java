package question2;

public class Record {
    
    public static void main(String[] args) {
        
        Student student = new Student("Gabriel");

        student.addQuiz(80);
        student.addQuiz(90);


        String name = student.getName();
        double totalQuizScore = student.getTotalScore();
        double averageScore = student.getAverageScore();

        System.out.println("The name of the student is: " + name);
        System.out.println("The total quiz score is: " + totalQuizScore);
        System.out.println("The average score is: " + averageScore);
    }
}
