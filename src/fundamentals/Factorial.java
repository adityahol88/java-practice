/**
 * Problem: Read a non-negative integer and calculate its factorial using both
 * iteration and recursion.
 */
package fundamentals;

import java.util.Scanner;

/** Demonstrates iterative and recursive factorial calculations. */
public class Factorial {
	
	
	/** Returns {@code n!} calculated using an iterative loop. */
	static long calculateFactorialWithIteration(long n) {
		long val = 1;
		for(long i=2;i<=n;i++) {
			val *=i;
		}
		return val;
	}
	/** Returns {@code n!} calculated recursively. */
	public static long calculateFactorialWithRecursion(long n) {
	    if (n <= 1)
	        return 1;
	    return n * calculateFactorialWithRecursion(n - 1);
	}
		/** Reads a value and displays both factorial calculations. */
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number to calculate factorial: ");
		long n = sc.nextInt();
		long iterativeAnswer = calculateFactorialWithIteration(n);
		System.out.println("factorial of n using iteration is : " + iterativeAnswer);
		long ans  = calculateFactorialWithRecursion(n);
		System.out.println("Factorial of n using recursion is : " + ans);
		sc.close();
	}

}
