/**
 * Problem: Read an integer array and a target value, then find the target's
 * first index using linear search.
 */
package algorithms;

import java.util.Scanner;

/** Demonstrates sequential searching through an integer array. */
public class LinearSearch {

    /** Returns the first index containing {@code target}, or {@code -1} if absent. */
    public static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /** Reads an array and target from standard input and reports the search result. */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();
        int index = linearSearch(arr, target);
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found.");
        }
        sc.close();
    }
}
