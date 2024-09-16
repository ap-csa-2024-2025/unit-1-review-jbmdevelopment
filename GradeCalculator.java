public class GradeCalculator
{
  public static void main(String[] args)
  {
    String course = "AP Computer Science A";
    int time = 250;
    int firstGrade = 65;
    int secondGrade = 70;
    int thirdGrade = 95;
    int fourthGrade = 25;
    double firstQuiz = 85.5;
    double secondQuiz = 95.3;
    double finalExamGrade = 50.25;
    int hours = (int)(time / 60);
    int minutes = (time % 60);
    double avgHWGrade = (double)(firstGrade + secondGrade + thirdGrade + fourthGrade)  / 4;
    double avgQuizGrade = (double)(firstQuiz + secondQuiz)  / 2;
    double workWeight = 0.35;
    double quizWeight = 0.15;
    double finalExamWeight = 0.50;
    int finalScore = (int)((avgHWGrade * workWeight) + (avgQuizGrade * quizWeight) + (finalExamGrade * finalExamWeight) + 0.5);
    System.out.println("Course name " + course);
    System.out.println("Average time in minutes: " + time);
    System.out.println("Homework grades for this course:");
    System.out.println(firstGrade);
    System.out.println(secondGrade);
    System.out.println(thirdGrade);
    System.out.println(fourthGrade);
    System.out.println("Quiz grades for this class:");
    System.out.println(firstQuiz);
    System.out.println(secondQuiz);
    System.out.println("Final exam grade for this course:");
    System.out.println(finalExamGrade);
    System.out.println("Weekly time spent: " + hours + " hours " + minutes + " minutes");
    System.out.println("Average homework grade: " + avgHWGrade);
    System.out.println("Average quiz grade: " + avgQuizGrade);
    System.out.println("Final exam grade: " + finalExamGrade);
    System.out.println("Overall grade: " + finalScore);
  }
}
