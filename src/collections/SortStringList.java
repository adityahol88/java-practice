package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SortStringList {
	
	public static void sortStringsAscending(ArrayList<String> list) {
		
		Collections.sort(list);
		System.out.println("Sorted in Ascending Order:");
		System.out.println(list);
	}	
	
	public static void sortStringsDescending(ArrayList<String> list) {
		
		Collections.sort(list,
			new Comparator<String>() {
			@Override
			public int compare(String a,String b) {
				return b.compareTo(a);
				}	
			}
		);
		System.out.println("Sorted in descending Order:");
		System.out.println(list);
	}

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
		
	}
}
