import java.util.Scanner;

public class StudentMarkSheet2 {
    // creat scanner object
    Scanner scanner = new Scanner(System.in);

    //variables to store name, roll no , marks ,total,percentage &results
    String student_name;
    int eng, maths, sci;
    int total_marks;
    int roll_no;

    public void score() {
        System.out.println("Enter your name:");
        student_name = scanner.nextLine();

        System.out.println("Enter your Rollno:");
        roll_no = scanner.nextInt();

        //-------------------------------------------------------------

        System.out.println("Enter your maths marks: ");
        int maths = scanner.nextInt();

        System.out.println("Enter your eng marks: ");
        int eng = scanner.nextInt();

        System.out.println("Enter your science marks: ");
        int sci = scanner.nextInt();

        int total = maths + eng + sci;
        float percentage = (total / 3);

        System.out.println("Your total marks= " + (total));
        System.out.println("Your percentage is =" + percentage);


        if (maths>=35 && sci>=35 && eng>=35)
        {
           // System.out.println("You are pass ");
        } else {
            System.out.println("Your are pass");

        }
        if (percentage >= 90 && percentage <= 100)
        {
            System.out.println("your grade is A+");




        }


    }

    public static void main(String[] args) {
        //creating class object to call non  static method in static area
        StudentMarkSheet1 markSheet = new StudentMarkSheet1();
        //calling method using class object
        markSheet.score();

    }
}




