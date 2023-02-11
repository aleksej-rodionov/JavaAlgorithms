package org.example;

import java.util.Random;

import static org.example.Main.printArray;

public class QuickSort {

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[1000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
        }
//        int[] numbers = new int[]{2, 14, 13, 17, 8, 6, 1, 19, 20, 10};
//        int[] numbers = new int[]{19, 20, 17};

        System.out.println("Before sorting:");
        printArray(numbers);

        quickSort(numbers, 0, numbers.length - 1);

        System.out.println("After sorting:");
        printArray(numbers);
    }

    public static void quickSort(int[] arrayToSort, int fromIndex, int toIndex) {
        System.out.println("fromIndex = " + fromIndex + ", toIndex = " + toIndex);

        if (fromIndex < toIndex) {
            int pivotIndex = partition(arrayToSort, fromIndex, toIndex);
            System.out.println("pivotIndex = " + pivotIndex);

            quickSort(arrayToSort, fromIndex, pivotIndex - 1);
            quickSort(arrayToSort, pivotIndex, toIndex);
        }
    }

    private static int partition(int[] arrayToSort, int fromIndex, int toIndex) {
        int leftIndex = fromIndex;
        int rightIndex = toIndex;
        int pivot = arrayToSort[fromIndex + (toIndex - fromIndex) / 2]; // here we take the middle element
//        int pivot = arrayToSort[fromIndex]; // here we take the start element
        System.out.println("pivot in partition = " + pivot);

        while (leftIndex <= rightIndex) {

            while (arrayToSort[leftIndex] < pivot) {
                leftIndex++;
            }

            while (arrayToSort[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(arrayToSort, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex; // here it equals pivotIndex
    }

    private static void swap(int[] array, int index1, int index2) {
        int tmp  = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}
