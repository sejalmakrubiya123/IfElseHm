import java.util.Scanner;

public class Operator {
    // main methed

    public static void main(String[] args) {
        // creat scanner class
        Scanner scanner = new Scanner(System.in);
        // intzer value
        float num1 ,num2 ,result;
        char ch;

        System.out.println(" Enter any Two Number : ");
        num1 = scanner.nextFloat();
        num2 = scanner.nextFloat();

        // enter operator
        System.out.println(" Enter the operator (+, -,* , / ): ");
        ch = scanner.next().charAt(0);

        if (ch == '+')result = num1 + num2;
        else if (ch == '+')result = num1 -num2 ;
        else if (ch == '*') result = num1 * num2;
        else if (ch == '/') result = num1 / num2;
        else
        {
            System.out.println(" \nInvalid Input ");
            return;

        }
        System.out.println(" \nReault = " + result);











    }


}
