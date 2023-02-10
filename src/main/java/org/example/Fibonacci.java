package org.example;

public class Fibonacci {

    private static long[] fibonacciCache;

    public static void main(String[] args) {

        int n = 50;
        fibonacciCache = new long[n + 1];

        System.out.println(fibonacci(n));
    }

    private static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        // check if fibCache already contains that value
        if (fibonacciCache[n] != 0) { // cause primitive long is default to zero if it hasn't been set
            return fibonacciCache[n];
        }

        long nthFibonacciNumber = fibonacci(n - 1) + fibonacci(n - 2);
        fibonacciCache[n] = nthFibonacciNumber;
        return nthFibonacciNumber;
    }
}


