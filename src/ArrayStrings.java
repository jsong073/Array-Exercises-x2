/*
This class will do the following:
1. Print a String in reverse
2. Find the length of an input String without using the library function
 */

import java.util.Scanner;
import java.util.Arrays;

public class ArrayStrings {
    public static void main (String[] args) {
        //Variables
        Scanner input = new Scanner(System.in);
        String word = "";
        char[] letters;
        char[] backwardsWord;
        int counter = 0;
        boolean quitLoop = false;

        System.out.print("Enter a word: ");
        word = input.nextLine();
        letters = word.toCharArray();       //Converts a String into an array of chars

        while (!quitLoop) {
            try {
                letters[counter] = letters[counter];
                counter++;
            } catch (IndexOutOfBoundsException e) {
                quitLoop = true;
            }
        }
        System.out.println("The length of that word: " + counter);

        System.out.print("That word backwards: ");
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
        System.out.println();
    }
}
