package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
<<<<<<< HEAD
 * <p>
 * Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 * if the number from the user is 1, 2,... 7, or other respectively. Use a "nested-if" statement.
=======
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
>>>>>>> fc36c4b1b8c5d2bc07ff287dc39939c4a3926817
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // 1) create scanner (don't forget to import Scanner!)

        Scanner prompt = new Scanner(System.in);

        // 2) prompt user

        System.out.print("Enter a number between 1 and 10: ");

        // 3) assign input to variable as int

        int i = prompt.nextInt();

        // 4) write completed code here

        if (i < 11 && i > 0) {
            if (i == 1) {
                System.out.println("Monday!");
            } else if (i == 2) {
                System.out.println("Tuesday!");
            } else if (i == 3) {
                System.out.println("Wednesday!");
            } else if (i == 4) {
                System.out.println("Thursday!");
            } else if (i == 5) {
                System.out.println("Friday!");
            } else if (i == 6) {
                System.out.println("Saturday!");
            } else if (i == 7) {
                System.out.println("Sunday!");
            } else {
                System.out.println("Other!");
            }
        } else {
            System.out.print("Enter a number between 1 and 10! : ");
            i = prompt.nextInt();
        }
    }
}
