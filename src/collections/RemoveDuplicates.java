package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {
	
	
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
		
	}
}
