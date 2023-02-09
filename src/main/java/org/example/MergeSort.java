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

    private static void mergeSort(int[] wholeArray) {
        int initialLength = wholeArray.length;

        if (initialLength < 2) { return; }

        int midIndex = initialLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[initialLength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = wholeArray[i];
        }
        for (int i = midIndex; i < initialLength; i++) {
            rightHalf[i - midIndex] = wholeArray[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(wholeArray, leftHalf, rightHalf);
    }

    private static void merge(int[] wholeArray, int[] leftHalf, int[] rightHalf) {
        int leftLength = leftHalf.length;
        int rightLength = rightHalf.length;
        int l = 0, r = 0, w = 0;

        while (l < leftLength && r < rightLength) {
            if (leftHalf[l] <= rightHalf[r]) {
                wholeArray[w] = leftHalf[l];
                l++;
            } else {
                wholeArray[w] = rightHalf[r];
                r++;
            }
            w++;
        }

        while (l < leftLength) {
            wholeArray[w] = leftHalf[l];
            l++;
            w++;
        }

        while (r < rightLength) {
            wholeArray[w] = rightHalf[r];
            r++;
            w++;
        }
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }
        System.out.println("");
    }
}
