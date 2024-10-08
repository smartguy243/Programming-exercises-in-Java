package Min_Max_Array_Finder; /*
   @author: SmartGuy
   @description: This program shows multiple ways to find maximum and minimum elements
                 of an array.
 */

 import java.util.Arrays;

     // 1. Without using any inbuilt method
 public  class FindMinAndMax {
         public static void main(String[] args) {
             int[] array = {1, 45, 123, 7, 12, 65, 3, 345, 25, 57};

             // Declaring min and max values as the first element of array
             int min = array[0];
             int max = array[0];

             // Iterating through the array with a for loop
             for (int i = 0; i < array.length; i++) {
                 if (array[i] < min) {
                     min = array[i];
                 } else if (array[i] > max) {
                     max = array[i];

                  /*This is the easiest way to find minimum
                    and maximum elements of an array.
                   */
                 }
             }
             System.out.println("The minimum is : " +min);
             System.out.println("The maximum is : " +max);
         }
 }

    // 2. Using inbuilt method to sort array

class FindMinAndMax2 {
    public static void main(String[] args) {
        int[] array = {1, 45, 123, 7, 12, 65, 3, 345 , 25, 57};

        // Invoking the method sort().
        Arrays.sort(array);

        /*
           After sorting the minimum will be the value at the 0th position
           and the maximum will be the value at nth position.
        */
        System.out.println( "The minimum element : " + array[0] + "\n" +
                "The maximum element : " + array[array.length-1]);

        /*
           The following algorithm has a good time complexity [O(n log(n))]
           and no extra space is used [O(1)].
        */
    }
}


    // 3. With a for loop using inbuilt methods min() and max().

class FindMinAndMax3 {

    // Method to find the minimum element.
    static int getMin(int[] arr, int n)
    {
        int result = arr[0];
        for (int i = 1; i < n; i++)
            result = Math.min(result, arr[i]); // Using min() method.
        return result;
    }

    // Method to find the maximum element.
    static int getMax(int[] arr, int n)
    {
        int result = arr[0];
        for (int i = 1; i < n; i++)
            result = Math.max(result, arr[i]); // Using max() method.
        return result;
    }

    // Driver code
    public static void main(String[] args)
    {
        int[] array = { 0, 9110, 32, 456, 78, 19 };
        int n = array.length;
        System.out.println("Minimum element of array: " + getMin(array, n)
                        + "Maximum element of array: " + getMax(array, n));

        /*
           This is the best way to find minimum and maximum elements of an array
           because the following algorithm has a better time complexity [O(n)]
           and no extra space is used [O(1)].
        */
    }
}

