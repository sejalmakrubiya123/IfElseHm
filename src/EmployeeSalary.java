import java.util.Scanner;

public class EmployeeSalary {
    //main method

    public static void main(String[] args) {

        float basic_salary, da, ta, pf,  hra , da1, hra1 ,ta1=0 ,pf1=0 , Gross_Salary ;
      //creat scannner class
        Scanner scanner = new Scanner(System.in);


      // enter basic salary of employee

        System.out.println("Enter Basic Salary Of Employee: ");
        basic_salary = scanner.nextFloat();

        System.out.println("Enter Basic DA Of Employee: ");
        da1 = scanner.nextFloat();

        System.out.println("Enter Basic HRA Of Employee: ");
        hra1 = scanner.nextFloat();

        System.out.println("Enter basic ta of employee: ");
        ta1 = scanner.nextInt();

        System.out.println("Enter basic pf of employee: ");

        da = (da1 * basic_salary) / 100;
        hra = (hra1 * basic_salary) / 100;
        ta = (ta1 * basic_salary) / 100;
        pf = (pf1 * basic_salary) / 100;


        Gross_Salary = basic_salary + da + hra +ta +pf;

        System.out.println("Gross Salary of Employee: " + Gross_Salary);





    }

}
