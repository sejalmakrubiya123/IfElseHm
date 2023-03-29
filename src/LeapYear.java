import java.time.Year;
import java.util.Scanner;

public class LeapYear {


// main method
    public static void main(String[] args) {
        // year to be checked
        Scanner scn = new Scanner(System.in);

       int Year = scn.nextInt();

        boolean leap = false;

        // if the year is divided by 4

       if (Year % 4 == 0) {

            // if the year is century


         if (Year % 100 == 0) {
             // if year is divided by 400
             // then it is a leap year

            if (Year % 400 == 0)
                leap = true;
            else
                leap = false;
        }

         // if the year is not century


          else
              leap = true;

            // any conditions fails-print non-leap year
           // System.out .println(Year + "is a Leap Year .");

        }
        else
            leap = false;

         if (leap)
             System.out.println(Year + " is a leap year. ");
         else
             System.out.println(Year + " is not a leap year . ");
        }







        }



