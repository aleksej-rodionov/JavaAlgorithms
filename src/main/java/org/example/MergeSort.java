package org.example;

import java.util.Random;

public class MergeSort {

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000000);
        }

        System.out.println("Before sorting:");
        printArray(numbers);

        mergeSort(numbers);

        System.out.println("After sorting:");
        printArray(numbers);
    }

    private static void mergeSort(int[] numbers) {
        int initialLength = numbers.length;

        if (initialLength < 2) { return; }

        int midIndex = initialLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[initialLength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = numbers[i];
        }
        for (int i = midIndex; i < initialLength; i++) {
            rightHalf[i - midIndex] = numbers[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        //merge them two
    }

    private static void merge(int[] initialArray, int[] leftHalf, int[] rightHalf) {
        int leftLength = leftHalf.length;
        int rightLength = rightHalf.length;
        int i = 0, j = 0, k = 0;


    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }
    }
}
