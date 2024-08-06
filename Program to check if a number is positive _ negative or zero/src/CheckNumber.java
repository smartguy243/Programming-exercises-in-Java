 /*
   @author: SmartGuy
   @description: This program shows multiple ways to check
                 if a number is positive, negative or zero.
 */


import java.util.Scanner;

    /*
      1. Without any interaction with user using a control flow structure.
         @description: The number to be checked is directly specify in the program.
    */
public class CheckNumber {
    public static void main(String[] args) {

        // Number to be checked.
        int number = 381;

        // Checking if the number is greater than 0 or not.
        if (number > 0) {
            System.out.println(number + " is a positive number");
        }
        // Checking if the number is less than 0 or not.
        else if (number < 0) {
            System.out.println(number + " is a negative number");
        }
        // Result when the above two conditions return false.
        else {
            System.out.println("The number is zero");
        }
    }
}



    /*
       2. With interaction with user using a control flow structure.
       @description: User is asked to provide the number to be checked
                     and the program displays if the number is positive,
                     negative or zero.
    */
class CheckNumber2 {
    public static void main(String[] args) {
        int number;

        // Getting number from the user using Scanner class.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = scanner.nextInt();

        // Checking if the number is greater than 0 or not.
        if (number > 0) {
            System.out.println(number + " is a positive number");
        }
        // Checking if the number is less than 0 or not.
        else if (number < 0) {
            System.out.println(number + " is a negative number");
        }
        // Result when the above two conditions return false.
        else {
            System.out.println("The number is zero");
        }
    }
}


    /*
       2. With interaction with user using inbuilt method signum().
       @description: User is asked to provide the number to be checked
                     and the program displays 1, -1 or 0.
    */
class CheckNumber3 {
    public static void main(String[] args) {
        int number;
        int result;

        // Getting number from the user using Scanner class.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = scanner.nextInt();

        // Using signum() method
        result = Integer.signum(number);

        /*
           Displaying result as follows:
             0 if the number is 0
             1 if the number is positive
            -1 if the number is negative
        */
        System.out.println(result);


    }
}