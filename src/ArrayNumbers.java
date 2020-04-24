/*
This class will do the following:
1. Prompt the user to input 10 values and store them in an array
    a. Output the total number of odd and even values in the array
    b. Remove any duplicate values and output the remaining values

Process:
1. Create an array to hold the input values
2. Set up a for loop to find the odd and even values
    FOR int i = 0 to the length of the array
        IF array[i] % 2 is equal to 0 THEN
            add 1 to the variable representing the number of even values
        ELSE
            add 1 to the variable representing the number of odd values
        ENDIF
    ENDFOR
3. Set up a for loop to find duplicate values


 */

import java.util.Scanner;
import java.util.Arrays;

public class ArrayNumbers {
    public static void main (String[] args) {
        //Variables
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int oddValues = 0;
        int evenValues = 0;
        int matchingValue = 0;
        boolean thereAreDuplicateValues = true;

        //This for loop will find the even and odd values
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number (" + (i + 1) + "/10): ");
            numbers[i] = input.nextInt();
            if (numbers[i] % 2 == 0) {
                evenValues++;
            } else {
                oddValues++;
            }
        }
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));
        System.out.println("The number of even values: " + evenValues);
        System.out.println("The number of odd values: " + oddValues);

        int newArrayLength = numbers.length;
        System.out.print(numbers[0]+" ");
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] != numbers[i + 1]) {
               System.out.print(numbers[i+1] + " ");
            }

        }


    }


}
