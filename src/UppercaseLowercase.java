import java.util.Scanner;

public class UppercaseLowercase {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an Alphabet in Uppercase :  ");

        char chUpper = scan.next().charAt(0);


        int user = chUpper;
        if (user>=65 && user <=90)
        {
            user = user +32;
            char chLower = (char) user;
            System.out.println("\n character in lowercase = " + chLower);
        }
        else if (user>97 && user<=122)
            System.out.println("\nAlphabet is lowercase.");





    }
}
