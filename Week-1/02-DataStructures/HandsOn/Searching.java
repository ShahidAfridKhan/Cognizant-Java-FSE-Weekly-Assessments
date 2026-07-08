package com.cognizant.datastructures;

/**
 * Searching Algorithms
 */
public class Searching {
    
    /**
     * Linear Search - O(n)
     * Works on both sorted and unsorted arrays
     * Best case: O(1) when element is at first position
     * Worst case: O(n) when element is at last position or not found
     * Average case: O(n)
     */
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;  // Found at index i
            }
        }
        return -1;  // Not found
    }
    
    /**
     * Binary Search - O(log n)
     * Only works on SORTED arrays
     * Best case: O(1) when element is at middle
     * Worst case: O(log n)
     * Average case: O(log n)
     * 
     * Why Binary Search cannot be used?
     * 1. Array must be sorted
     * 2. Random access needed (works with arrays, not linked lists)
     * 3. Extra space needed for recursive implementation
     */
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;  // Prevents overflow
            
            if (arr[mid] == target) {
                return mid;  // Found
            } else if (arr[mid] < target) {
                left = mid + 1;  // Search right half
            } else {
                right = mid - 1;  // Search left half
            }
        }
        
        return -1;  // Not found
    }
    
    /**
     * Binary Search - Recursive Implementation
     */
    public static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        
        int mid = left + (right - left) / 2;
        
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearchRecursive(arr, target, mid + 1, right);
        } else {
            return binarySearchRecursive(arr, target, left, mid - 1);
        }
    }
    
    /**
     * Comparison: Linear vs Binary Search
     * 
     * Linear Search:
     * - Works on unsorted arrays
     * - O(n) time complexity
     * - Simpler implementation
     * - Better for small arrays
     * 
     * Binary Search:
     * - Only works on sorted arrays
     * - O(log n) time complexity
     * - More efficient for large arrays
     * - Requires extra space for recursion
     */
}

// Test
class SearchingTest {
    public static void main(String[] args) {
        int[] unsorted = {64, 34, 25, 12, 22, 11, 90};
        int[] sorted = {11, 12, 22, 25, 34, 64, 90};
        
        System.out.println("=== Linear Search ===");
        System.out.println("Search 25 in unsorted: " + Searching.linearSearch(unsorted, 25));
        System.out.println("Search 100 in unsorted: " + Searching.linearSearch(unsorted, 100));
        
        System.out.println("\n=== Binary Search ===");
        System.out.println("Search 25 in sorted: " + Searching.binarySearch(sorted, 25));
        System.out.println("Search 100 in sorted: " + Searching.binarySearch(sorted, 100));
        
        System.out.println("\n=== Binary Search Recursive ===");
        System.out.println("Search 25 in sorted: " + Searching.binarySearchRecursive(sorted, 25, 0, sorted.length - 1));
        System.out.println("Search 100 in sorted: " + Searching.binarySearchRecursive(sorted, 100, 0, sorted.length - 1));
        
        // Complexity comparison
        System.out.println("\n=== Complexity Analysis ===");
        System.out.println("Array size: 1,000,000");
        System.out.println("Linear Search worst case: 1,000,000 comparisons");
        System.out.println("Binary Search worst case: " + (int)(Math.log(1000000)/Math.log(2)) + " comparisons");
    }
}
