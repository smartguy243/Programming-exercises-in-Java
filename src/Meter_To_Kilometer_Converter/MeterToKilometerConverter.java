  /*
    @author: SmartGuy
    @description: This program shows multiple ways to convert
                  a given number in meter to kilometer.
  */

package Meter_To_Kilometer_Converter;

import java.util.Scanner;

    /*
       1. Without no user interaction.
       @description: Numbers values are directly specified in the program.
    */

public class MeterToKilometerConverter {
    public static void main(String[] args) {

        // Number to be summed
        double meters = 1250;

        // Calculate the sum of number1 and number2
        double kilometers = meters / 1000;

        // Displaying result
        System.out.println(meters + " meters = " + kilometers + " kilometers");
    }
}

    /*
       2. With user interaction.
       @description: User is asked to provide the value in meter
                     and the program converts it in kilometer.
    */

class MeterToKilometerConverter2 {
    public static void main(String[] args) {

        // Getting values from user using Scanner class.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value in meter :");
        double meters = scanner.nextDouble();

        // Converts the value in kilometer
        double kilometers = meters / 1000;

        // Displaying result
        System.out.println(meters + " meters = " + kilometers + " kilometers");

    }
}