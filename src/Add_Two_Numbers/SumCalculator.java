 /*
   @author: SmartGuy
   @description: This program shows multiple ways to calculate
                 the sum of two given numbers.
 */

   package Add_Two_Numbers;

   import java.util.Scanner;

    /*
       1. Without using any inbuilt method and no user interaction.
       @description: Numbers values are directly specified in the program.
    */

public class SumCalculator {
    public static void main(String[] args) {

        // Number to be summed
        int number1 = 5;
        int number2 = 12;

        // Calculate the sum of number1 and number2
        int sum = number1 + number2;

        // Displaying result
        System.out.println("The sum of " +number1 + " and " + number2 + " is : " +sum);
    }
}

  /*
     1. Using an inbuilt method sum().
     @description: Numbers values are directly specified in the program.
  */

class SumCalculator2 {
    public static void main(String[] args) {

        // Number to be summed
        int number1 = 35;
        int number2 = 7;

        // Invoking inbuilt method sum() to add the numbers.
        int sum = Integer.sum(number1, number2);

        // Displaying result
        System.out.println("The sum of " +number1 + " and " + number2 + " is : " +sum);
    }
}

    /*
       3. With user interaction.
       @description: User is asked to provide the two numbers values
                     and the sum is calculated based on the provided values.
    */

class SumCalculator3 {
    public static void main(String[] args) {

        // Getting values from user using Scanner class.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the first number :");
        int number1 = sc.nextInt();
        System.out.println("Enter the value of the second number :");
        int number2 = sc.nextInt();

        // Calculate the sum of number1 and number2
        int sum = number1 + number2;

        // Displaying result
        System.out.println("The sum of " +number1 + " and " + number2 + " is : " +sum);

    }
}