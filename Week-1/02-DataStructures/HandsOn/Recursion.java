package com.cognizant.datastructures;

/**
 * Recursion - Function calling itself
 * Every recursive function needs:
 * 1. Base case - stopping condition
 * 2. Recursive case - function calling itself
 * 3. Progress towards base case
 */
public class Recursion {
    
    /**
     * Factorial - n! = n * (n-1)!
     * Base case: 0! = 1
     * Time Complexity: O(n)
     * Space Complexity: O(n) - Call stack
     */
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;  // Base case
        }
        return n * factorial(n - 1);  // Recursive case
    }
    
    /**
     * Fibonacci - fib(n) = fib(n-1) + fib(n-2)
     * Base cases: fib(0) = 0, fib(1) = 1
     * Without memoization: O(2^n) - VERY INEFFICIENT
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;  // Base case
        }
        return fibonacci(n - 1) + fibonacci(n - 2);  // Recursive case
    }
    
    /**
     * Fibonacci with Memoization - O(n)
     * Stores already computed values
     */
    public static int fibonacciMemo(int n, int[] memo) {
        if (n <= 1) {
            return n;
        }
        
        if (memo[n] != -1) {
            return memo[n];  // Return cached result
        }
        
        memo[n] = fibonacciMemo(n - 1, memo) + fibonacciMemo(n - 2, memo);
        return memo[n];
    }
    
    /**
     * Power - a^b
     * Base case: a^0 = 1
     * Time Complexity: O(log b) using binary exponentiation
     */
    public static int power(int a, int b) {
        if (b == 0) {
            return 1;  // Base case
        }
        if (b % 2 == 0) {
            int half = power(a, b / 2);
            return half * half;  // Optimization
        } else {
            return a * power(a, b - 1);
        }
    }
    
    /**
     * Binary Search using Recursion
     * Time Complexity: O(log n)
     */
    public static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;  // Base case: not found
        }
        
        int mid = left + (right - left) / 2;
        
        if (arr[mid] == target) {
            return mid;  // Base case: found
        } else if (arr[mid] < target) {
            return binarySearchRecursive(arr, target, mid + 1, right);  // Recursive case
        } else {
            return binarySearchRecursive(arr, target, left, mid - 1);  // Recursive case
        }
    }
    
    /**
     * Sum of array elements
     * Base case: array with one element
     * Time Complexity: O(n)
     */
    public static int sumArray(int[] arr, int index) {
        if (index == arr.length) {
            return 0;  // Base case
        }
        return arr[index] + sumArray(arr, index + 1);  // Recursive case
    }
    
    /**
     * Tail Recursion - Recursive call is the last operation
     * Compiler can optimize it to loop (tail call optimization)
     * Time Complexity: O(n)
     * Space Complexity: O(1) - with compiler optimization
     */
    public static int tailFactorial(int n, int accumulator) {
        if (n <= 1) {
            return accumulator;  // Base case
        }
        return tailFactorial(n - 1, n * accumulator);  // Tail recursive call
    }
    
    /**
     * Reverse a string using recursion
     */
    public static String reverseString(String s) {
        if (s.length() == 0) {
            return s;  // Base case
        }
        return reverseString(s.substring(1)) + s.charAt(0);  // Recursive case
    }
}

// Test
class RecursionTest {
    public static void main(String[] args) {
        System.out.println("=== Factorial ===");
        System.out.println("5! = " + Recursion.factorial(5));
        
        System.out.println("\n=== Fibonacci ===");
        System.out.println("fib(10) without memo = " + Recursion.fibonacci(10));
        
        int[] memo = new int[11];
        for (int i = 0; i < memo.length; i++) {
            memo[i] = -1;
        }
        System.out.println("fib(10) with memo = " + Recursion.fibonacciMemo(10, memo));
        
        System.out.println("\n=== Power ===");
        System.out.println("2^10 = " + Recursion.power(2, 10));
        
        System.out.println("\n=== Sum Array ===");
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Sum of [1,2,3,4,5] = " + Recursion.sumArray(arr, 0));
        
        System.out.println("\n=== Tail Factorial ===");
        System.out.println("5! (tail recursive) = " + Recursion.tailFactorial(5, 1));
        
        System.out.println("\n=== Reverse String ===");
        System.out.println("Reverse of 'hello' = " + Recursion.reverseString("hello"));
    }
}
