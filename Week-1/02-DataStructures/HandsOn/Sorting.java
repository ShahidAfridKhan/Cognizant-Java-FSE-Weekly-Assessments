package com.cognizant.datastructures;

/**
 * Sorting Algorithms
 */
public class Sorting {
    
    /**
     * Bubble Sort - O(n^2)
     * Compares adjacent elements and swaps them if they're in wrong order
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
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
     * Quick Sort - O(n log n) average, O(n^2) worst case
     * Divide and conquer approach
     */
    public static void quickSort(int[] arr) {
        if (arr.length == 0) return;
        quickSort(arr, 0, arr.length - 1);
    }
    
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1;
    }
    
    /**
     * Merge Sort - O(n log n)
     * Stable sorting algorithm
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
     * Insertion Sort - O(n^2)
     * Good for small arrays and nearly sorted data
     */
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    
    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Test
class SortingTest {
    public static void main(String[] args) {
        int[] arr1 = {64, 34, 25, 12, 22, 11, 90};
        int[] arr2 = arr1.clone();
        int[] arr3 = arr1.clone();
        int[] arr4 = arr1.clone();
        
        System.out.println("Original: ");
        Sorting.printArray(arr1);
        
        Sorting.bubbleSort(arr1);
        System.out.println("Bubble Sort: ");
        Sorting.printArray(arr1);
        
        Sorting.quickSort(arr2);
        System.out.println("Quick Sort: ");
        Sorting.printArray(arr2);
        
        Sorting.mergeSort(arr3);
        System.out.println("Merge Sort: ");
        Sorting.printArray(arr3);
        
        Sorting.insertionSort(arr4);
        System.out.println("Insertion Sort: ");
        Sorting.printArray(arr4);
    }
}
