import java.util.Scanner;

public class InterChangedValue {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter first number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number : ");
        int num2 = scanner.nextInt();

        int num3 = 0;
        num3 = num1;
        num1 =  num2;
        num2 = num3;

        System.out.println("After swapping :");
        System.out.println("Value of first number :" + num1);
        System.out.println("Value of second number :" + num2);

    }

}
