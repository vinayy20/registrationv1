package com.api;

import java.util.Scanner;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Outer loop for multiple passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop for pairwise comparison
            for (int j = 0; j < n - i - 1; j++) {
                // If the current element is greater than the next, swap them
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps were made in this pass, the array is sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        bubbleSort(arr);

        System.out.println("\nSorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
