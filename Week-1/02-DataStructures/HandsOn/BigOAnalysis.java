package com.cognizant.datastructures;

/**
 * Big O Complexity Analysis
 * Time Complexity: How execution time grows with input size
 * Space Complexity: How memory usage grows with input size
 */
public class BigOAnalysis {
    
    /**
     * O(1) - Constant Time
     * No matter the input size, execution time is constant
     */
    public static int getFirstElement(int[] arr) {
        return arr[0];  // Always 1 operation
    }
    
    /**
     * O(n) - Linear Time
     * Execution time grows linearly with input size
     */
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
    /**
     * O(n^2) - Quadratic Time
     * Nested loops - often in sorting algorithms
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    /**
     * O(log n) - Logarithmic Time
     * Binary search - problem size halves in each iteration
     */
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    
    /**
     * O(n log n) - Efficient sorting
     * Merge sort, Quick sort
     */
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) return;
        
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);
        
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }
    
    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
    
    /**
     * O(2^n) - Exponential Time
     * Very inefficient - avoid if possible
     * Example: Recursive Fibonacci without memoization
     */
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

// Summary Table:
// O(1)     - Constant - Array access
// O(log n) - Logarithmic - Binary Search
// O(n)     - Linear - Linear Search
// O(n log n) - Linearithmic - Merge Sort, Quick Sort
// O(n^2)   - Quadratic - Bubble Sort, Selection Sort
// O(n^3)   - Cubic - Matrix multiplication
// O(2^n)   - Exponential - Recursive problems
// O(n!)    - Factorial - Permutations
