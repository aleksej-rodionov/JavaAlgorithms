package org.example;

/**
 * Complexity: O(log n)
 */
public class BinarySearchIterative {

    public static void main(String[] args) {
        int[] array = new int[]{13, 16, 22, 24, 24, 27, 32, 33, 36, 39, 41, 42, 42, 47, 48, 53, 55, 56, 57, 64, 66, 69, 73, 74};

        int indexWanted = binarySearchIterative(array, 33);
        System.out.println(indexWanted);
    }

    private static int binarySearchIterative(int[] array, int elementWanted) {
        int indexWanted = -1;
        int indexStart = 0;
        int indexEnd = array.length - 1;
        int indexMiddle;

        while (indexStart <= indexEnd) {
            indexMiddle = Math.floorDiv(indexStart + indexEnd, 2);

            if (elementWanted == array[indexMiddle]) {
                indexWanted = indexMiddle;
                return indexWanted;
            } else if (elementWanted < array[indexMiddle]) {
                indexEnd = indexMiddle - 1;
            } else {
                indexStart = indexMiddle + 1;
            }
        }

        return indexWanted;
    }
}
