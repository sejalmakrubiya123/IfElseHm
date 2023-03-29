import java.util.Scanner;

public class FindOutNumber {
    public static void main(String[] args) {
        int num;

        // object of the Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        //reading a number from the user
        num = scanner.nextInt();
        //checks the numbers is greater than 0 or not
        if (num>0)
        {
            System.out.println("The number is positive.");
        }
        //checks the number is less than 0 or not
        else if (num<0) {
            System.out.println("The number is negative. ");

        }
        //excutes when the above two conditions return false

        else {
            System.out.println("The number is zero. ");
        }
    }
}
