/**
 * Problem: Read two integers and swap their values without using a temporary
 * variable.
 */
package fundamentals;

import java.util.Scanner;

/** Demonstrates swapping two integers with the XOR operator. */
public class SwappingWithoutTemp {

	/** Returns the two values swapped using XOR, without a temporary variable. */
	static int[] swap(int first, int second) {
		first = first ^ second;
		second = first ^ second;
		first = first ^ second;
		return new int[] {first, second};
	}
	
	
	
	/** Reads two numbers, swaps them, and prints the swapped values. */
	public static void main(String[] args) {
		System.out.print("Enter two numebers to swap seperated by space: ");
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		int[] swapped = swap(first, second);
		System.out.println("Two swapped numbers are " + swapped[0] + " " + swapped[1]);
		sc.close();
		
	}

}
