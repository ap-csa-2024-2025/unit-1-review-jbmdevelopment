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
    int hours = (int)((time / 60) + 0.5);
    double avgHWGrade = (double)(firstGrade + secondGrade + thirdGrade + fourthGrade)  / 4;
    double avgQuizGrade = (double)(firstQuiz + secondQuiz)  / 2;
    double workWeight = 0.35;
    double quizWeight = 0.15;
    double finalExamWeight = 0.50;
    // use modulo to get the minutes left from hours calculation (adjust it later)
    int finalScore = (int)((avgHWGrade * workWeight) + (avgQuizGrade * quizWeight) + (finalExamGrade * finalExamWeight) + 0.5);
    //System.out.print(finalScore);
    //System.out.print(avgHWGrade);
        //System.out.print(avgQuizGrade);
    System.out.println(course);
    System.out.println("Avg time per week in hours: " + hours);
    System.out.println("Avg time per week in minutes: " + time);
    // print it out later...
  }
}
