/* @author: SmartGuy
   @description: This program shows multiple way to find the area of a rectangle
   with length and width
 */

import java.util.Scanner;



/* 1. Without any interaction with user.
     @description: Values of length and width are already specify in the program.
     */
public class AreaOfRectangle {
        public static void main(String[] args) {
            int length = 7;
            int width = 5;
            int area = length * width;
            System.out.println("The area of the rectangle is : " +area);
        }
}



    /* 2. With user interaction.
       @description: User are asked to provide the length and width values.
       and the area is calculated based on the provided values
     */
class AreaOfRectangle2 {
    public static void main(String[] args) {
        int length;
        int width;
        int area;

        // Getting length and width from the user using Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        length = scanner.nextInt();
        System.out.println("Enter the width of the rectangle: ");
        width = scanner.nextInt();

        // Calculating the area with provided values
        area = length * width;

        // Displaying results
        System.out.println("The length of the rectangle is : " +length + "\n"
                         + "The width of the rectangle is : " +width + "\n"
                         + "The area of the rectangle is : " +area  );
    }
}