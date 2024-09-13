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
    double finalExam = 50.25;
    int hours = (int)((time / 60) + 0.5);
    System.out.println(course);
    System.out.println("Avg time per week in hours: " + hours);
    System.out.println("Avg time per week in minutes: " + time);
  }
}
