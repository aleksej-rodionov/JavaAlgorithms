package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Complexity: O(n)
 */
public class ReverseArray {

    public static void main(String[] args) {
        int[] array = IntStream.range(1, 101).toArray();
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}
