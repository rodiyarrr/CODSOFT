import java.util.*; //for input functions
public class StudentGradeCalculator{
    public static void main(String[] args){
        float marksSubject1,marksSubject2,marksSubject3,marksSubject4,marksSubject5;//Declaring variables for marks in each subject
        Scanner sc=new Scanner(System.in);//Creating an object for scanner class to input marks
        System.out.println("Enter Marks in Subject 1 : ");
        marksSubject1=sc.nextFloat();
        System.out.println("Enter Marks in Subject 2 : ");
        marksSubject2=sc.nextFloat();
        System.out.println("Enter Marks in Subject 3 : ");
        marksSubject3=sc.nextFloat();
        System.out.println("Enter Marks in Subject 4 : ");
        marksSubject4=sc.nextFloat();
        System.out.println("Enter Marks in Subject 5 : ");
        marksSubject5=sc.nextFloat();

        float totalMarks = marksSubject1 + marksSubject2 + marksSubject3 + marksSubject4 + marksSubject5;
        float averagePercentage = totalMarks/5;
        String grade;
        if(averagePercentage>=90 && averagePercentage<=100){
            grade="A";
        }
        else if (averagePercentage>=80 && averagePercentage<=89) {
            grade="B";
        }
        else if (averagePercentage>=70 && averagePercentage<=79) {
            grade="C";
        }
        else if (averagePercentage>=60 && averagePercentage<=69) {
            grade="D";
        }
        else{
            grade="E";
        }
        //to display the total marks, average percentage and the grade obtained by the student
        System.out.println("Total marks obtained by the student are : "+totalMarks);
        System.out.println("Average percentage is : "+averagePercentage);
        System.out.println("Grade is : "+grade);
    }
}