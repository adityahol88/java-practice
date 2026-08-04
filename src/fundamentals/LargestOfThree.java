/**
 * Problem: Read three numbers and print the largest of them.
 */
package fundamentals;

import java.util.Scanner;

/** Finds the maximum among three input values. */
public class LargestOfThree {

	/** Returns the largest of the three supplied integers. */
	static int findLargest(int n1, int n2, int n3) {
		return Math.max(Math.max(n1, n2), n3);
	}

	/** Reads three numbers and prints their largest value. */
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter three numbers to check : ");
	int n1 = sc.nextInt();
	int n2 = sc.nextInt();
	int n3 = sc.nextInt();
	System.out.println("Largest number is : " + findLargest(n1, n2, n3));
	sc.close();
	}
}
