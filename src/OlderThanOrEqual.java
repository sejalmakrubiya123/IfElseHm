import java.util.Scanner;

public class OlderThanOrEqual {


    Scanner scanner = new Scanner(System.in);

    public void eligibleForVote(){
        //acknowledge the user what to enter
        System.out.println("please enter you age in inter value : ");
        // storing age in variable using scanner object


        int age = scanner.nextInt();
        if (age>=18)
        {
            System.out.println("You are eligible for vote as you age is : " + age);

        }else {
            System.out.println("You are not eligible for vote as you age is : " + age);
        }

    }

    public static void main(String[] args) {
        //creating class object to call not-static method in static area
        OlderThanOrEqual olderThanOrEqual = new OlderThanOrEqual();

        //calling method using class object
        olderThanOrEqual.eligibleForVote();

    }
}




