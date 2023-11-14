package question2;

public class Student {
    private String name;
    private double totalQuizScore = 0;
    private double quizCount = 0;

    public Student(String name){
        this.name = name;
    }
    
   public String getName(){
        return this.name;
    }

    public void addQuiz(int score){
        quizCount += 1;
        totalQuizScore += score;

    }

    public double getTotalScore(){
        return this.totalQuizScore;
    }

    public double getAverageScore(){
        if (quizCount == 0){
            return 0;
        }

        return totalQuizScore/quizCount;
    }  

}

