import java.util.Scanner;

public class StudentMarkSheet1 {

    // creat scanner object
    Scanner scanner = new Scanner(System.in);

    //variables to store name, roll no , marks ,total,percentage &results
    String student_name;
    int eng, maths, sci;
    int total_marks;
    int roll_no;

    public void score() {
        //______________________Enter name roll number______________________________________________
        System.out.println("Enter your name :");
        student_name = scanner.nextLine();

        System.out.println("Enter your Rollno :");
        roll_no = scanner.nextInt();

        //_____________________________Enter maths eng sci marks________________________________________
        System.out.println("Enter your maths marks : ");
        int maths = scanner.nextInt();
        System.out.println("Enter your eng marks : ");
        int eng = scanner.nextInt();
        System.out.println("Enter your science marks : ");
        int sci = scanner.nextInt();
        //__________________________total all marks__________________________________________________
        int total = maths + eng + sci;

        float percentage = (total / 3);

        System.out.println("Your total marks = " + (total));
        System.out.println("Your percentage is =" + percentage);

        //Pass & else
       // if (maths>=35 && sci>=35 && eng>=35)
        if (percentage <= 35  )
        {

            System.out.println("You are fail");
        }
        else
        {
            System.out.println("You are pass");
        }

        if (percentage >= 90 && percentage <= 100) {
            System.out.println("your grade is A+");

        } else if (percentage >= 75 && percentage <= 90) {
            System.out.println("Your grade is A ");
        } else if (percentage >= 60 && percentage <= 74) {
            System.out.println("Your grade is b+");
        } else if (percentage >= 50 && percentage <= 59) {
            System.out.println("Your grade is b");

        } else if (percentage >= 35 && percentage <= 50) {
            System.out.println("Your grade is c");
       // } else {
           // System.out.println("Your are fail");
           // System.out.println("Your are pass");

        }


    }

    public static void main(String[] args) {
        //creating class object to call non  static method in static area
        StudentMarkSheet1 markSheet = new StudentMarkSheet1();
        //calling method using class object
        markSheet.score();

    }
}



























