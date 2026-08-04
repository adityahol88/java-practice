/**
 * Problem: Read a list of strings and display it in both ascending and
 * descending lexicographic order.
 */
package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/** Demonstrates ascending and descending sorting of strings. */
public class SortStringList {
	
	/** Sorts {@code list} in ascending lexicographic order and prints it. */
	public static void sortStringsAscending(ArrayList<String> list) {
		
		Collections.sort(list);
		System.out.println("Sorted in Ascending Order:");
		System.out.println(list);
	}	
	
	/** Sorts {@code list} in descending lexicographic order and prints it. */
	public static void sortStringsDescending(ArrayList<String> list) {
		
		Collections.sort(list,
			new Comparator<String>() {
			/** Compares two strings in reverse lexicographic order. */
			@Override
			public int compare(String a,String b) {
				return b.compareTo(a);
				}	
			}
		);
		System.out.println("Sorted in descending Order:");
		System.out.println(list);
	}

	/** Reads strings and displays both requested orderings. */
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of strings: ");
		int n = sc.nextInt();

		System.out.println("Enter " + n + " Strings:");

		for (int i = 0; i < n; i++) {
		    list.add(sc.next());
		}
		sortStringsAscending(list);
		System.out.println();
		sortStringsDescending(list);
		sc.close();
		
	}
}
