/* This program shows multiple way to find maximum and minimum elements
   of an array
 */

// 1. By using inbuilt function
import java.util.Arrays;
public class FindMinAndMax {
    public static void main(String[] args) {
        int[] array = {1,45,123,7,12,65,3,345,25,98,57};

        // Using inbuilt function to sort array
        Arrays.sort(array);

        /* After sorting the minimum will be the value at the 0th position
           and the maximum will be the value at nth position */
        System.out.println( "The minimum element : " + array[0] + "\n" +
                "The maximum element : " + array[array.length-1]);

        /* This is the easiest way to find
        minimum and maximum elements of and array and this algorithm
        has a good time complexity [O(n log(n))] and no extra space is used [O(1)]
        */
    }
}
