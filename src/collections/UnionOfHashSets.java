/**
 * Problem: Read two sets of integers and display their mathematical union,
 * containing each value only once.
 */
package collections;

import java.util.HashSet;
import java.util.Scanner;


/** Demonstrates set-union operations with {@link HashSet}. */
public class UnionOfHashSets {
	/** Reads two sets and displays their union. */
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();

		System.out.print("Enter number of elements in first set : ");
		int n1 = sc.nextInt();

		System.out.println("Enter " + n1 + " integers:");
		for (int i = 0; i < n1; i++) {
		    set1.add(sc.nextInt());
		}
		System.out.print("Enter number of elements in second set : ");
		int n2 = sc.nextInt();

		System.out.println("Enter " + n2 + " integers:");
		for (int i = 0; i < n2; i++) {
		    set1.add(sc.nextInt());
		}
		HashSet<Integer> union = new HashSet<>(set1);
		union.addAll(set2);
		System.out.println("Union of two sets is ; ");
		System.out.println(union);
		sc.close();
		
	}
}
