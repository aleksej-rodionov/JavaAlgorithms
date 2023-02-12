package org.example;

import java.util.Random;

import static org.example.Main.printArray;

/**
 * Complexity: O(n*n)
 */
public class SelectionSort {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
//        int[] array = new int[]{64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};

        System.out.println("Before sorting:");
        printArray(array);

        selectionSort(array);

        System.out.println("After sorting:");
        printArray(array);
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minValueIndex = findMinValueIndex(array, i);

            int temp = array[i];
            array[i] = array[minValueIndex];
            array[minValueIndex] = temp;
        }
    }

    private static int findMinValueIndex(int[] array, int startIndex) {
        int curMinValueIndex = startIndex;
        int curMinValue = array[startIndex];

        for (int i = startIndex + 1; i < array.length; i++) {
            if (array[i] < curMinValue) {
                curMinValueIndex = i;
                curMinValue = array[i];
            }
        }

        return curMinValueIndex;
    }
}









