package org.example;

import java.util.Random;

import static org.example.Main.printArray;

/**
 * Complexity: O(n²)
 */
public class InsertionSort {

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10000000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10000);
        }

        System.out.println("Before sorting:");
        printArray(numbers);

        insertionSort(numbers);

        System.out.println("After sorting:");
        printArray(numbers);
    }

    private static void insertionSort(int[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) {
            int current = inputArray[i];
            int j = i - 1;
            while(j >= 0 && inputArray[j] > current) { // cause everything that less is sorted already
                inputArray[j + 1] = inputArray[j];
                j--;
            }
            inputArray[j + 1] = current;
        }
    }
}






