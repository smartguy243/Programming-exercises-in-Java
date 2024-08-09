  /*
    @author: SmartGuy
    @description: This program checks the length of two words
                  and compare them each other to determine which one
                  is longer or shorter.
  */


package Words_Length_Comparator;

import java.util.Scanner;

  /*
         1. Without no user interaction.
         @description: Numbers values are directly specified in the program.
      */
public class WordsLengthComparator {
    public static void main(String[] args) {

        // Words to be checked
        String firstWord = "Smart";
        String secondWord = "Guy";

        // Invoking method length()
        int l1 = firstWord.length();
        int l2 = secondWord.length();

        // Comparing the words
        if (l1 > l2) {
            System.out.println("The word '" + firstWord + "' is longer than the word '" + secondWord + "'.");
        } else if (l1 < l2) {
            System.out.println("The word '" + secondWord + "' is longer than the word '" + firstWord + "'.");
        } else {
            System.out.println(firstWord + " and " + secondWord + " have the same length.");
        }
    }

}

    /*
       2. With user interaction.
       @description: User is asked to enter two words and the
                     program checks their length and returns
                     which one is longer or shorter.
    */

class WordsLengthComparator2 {
      public static void main(String[] args) {

          // Getting values from user using Scanner class.
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter the value of the first number :");
          String firstWord = scanner.nextLine();
          System.out.println("Enter the value of the second number :");
          String secondWord = scanner.nextLine();

          // Invoking method length()
          int length1 = firstWord.length();
          int length2 = secondWord.length();

          // Comparing the words
          if (length1 > length2) {
              System.out.println("The word '" + firstWord + "' is longer than the word '" + secondWord + "'.");
          } else if (length1 < length2) {
              System.out.println("The word '" + secondWord + "' is longer than the word '" + firstWord + "'.");
          } else {
              System.out.println(firstWord + " and " + secondWord + " have the same length.");
          }
      }
}