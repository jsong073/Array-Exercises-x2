/*
This class will do the following:
1. Take two given arrays [1,7,6,5,9] and [2,7,6,3,4]
2. Print out all pairs from arrays 1 and 2 that give a sum of 13
 */

import java.util.Arrays;

public class ArrayCompare {
    public static void main (String[] args) {
        int[] numbers1 = {1, 7, 6, 5, 9};
        int[] numbers2 = {2, 7, 6, 3, 4};

        for (int i = 0; i < numbers1.length; i++) {
            for (int j = 0; j < numbers2.length; j++) {
                if ((numbers1[i] + numbers2[j]) == 13){
                    System.out.println("(" + numbers1[i] + ", " + numbers2[j] + ")");
                }
            }
        }
    }
}
