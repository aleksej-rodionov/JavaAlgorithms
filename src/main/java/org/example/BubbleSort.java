package org.example;

import java.util.Arrays;
import java.util.Random;

/**
 * Complexity: O(n*n)
 */
public class BubbleSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
//        int[] array = new int[]{64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(array));

        bubbleSort(array);

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(array));
    }

    private static void bubbleSort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
    }
}
