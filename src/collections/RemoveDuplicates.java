/**
 * Problem: Read a list of integers, remove repeated values while preserving
 * the first occurrence of each value, and display the resulting list.
 */
package collections;

import java.util.ArrayList;
import java.util.Scanner;

/** Demonstrates in-place duplicate removal from an {@link ArrayList}. */
public class RemoveDuplicates {
	
	
	/** Removes duplicate values from {@code list} in place. */
	public static void removeDuplicates(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
		    for (int j = i + 1; j < list.size(); ) {
		        if (list.get(i).equals(list.get(j))) {
		            list.remove(j);
		        } else {
		            j++;
		        }
		    }
		}
	}
	
	/** Reads integer values, removes duplicates, and prints the list. */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();

		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();

		System.out.println("Enter " + n + " integers:");

		for (int i = 0; i < n; i++) {
		    list.add(sc.nextInt());
		}
		removeDuplicates(list);
		System.out.println("After removing duplicates list is ");
		System.out.println(list);
		sc.close();
		
	}
}
