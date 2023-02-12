package org.example;

/**
 * Complexity: O(log n)
 */
public class BinarySearchRecursive {

    public static void main(String[] args) {
        int[] array = new int[]{13, 16, 22, 24, 24, 27, 32, 33, 36, 39, 41, 42, 42, 47, 48, 53, 55, 56, 57, 64, 66, 69, 73, 74};

        int indexWanted = binarySearchRecursive(array, 0, array.length - 1, 33);
        System.out.println(indexWanted);
    }

    private static int binarySearchRecursive(int[] array, int indexStart, int indexEnd, int elementWanted) {
        if (indexStart > indexEnd) {
            return -1;
        }

        int indexMiddle = Math.floorDiv(indexStart + indexEnd, 2);
        if (array[indexMiddle] == elementWanted) {
            return indexMiddle;
        } else if (elementWanted < array[indexMiddle]) {
            return binarySearchRecursive(array, indexStart, indexMiddle - 1, elementWanted);
        } else {
            return binarySearchRecursive(array, indexMiddle + 1, indexEnd, elementWanted);
        }
    }
}
