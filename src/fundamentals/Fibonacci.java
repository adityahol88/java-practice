/**
 * Problem: Read a count and display the Fibonacci sequence using both an
 * iterative algorithm and a recursive algorithm.
 */
package fundamentals;

import java.util.Scanner;

/** Demonstrates iterative and recursive Fibonacci calculations. */
public class Fibonacci {
	
	/** Prints the first {@code n} Fibonacci values iteratively. */
	public static void printFibonacciWithIteration(int n) {
		System.out.println("Fibonacci Numbers using iteration");
		int a=0,b=1;
		System.out.print(a + " "+ b + " ");
		for(int i=0;i<n-2;i++) {
			int next = a+b;
			System.out.print((next)+" ");
			a = b;
			b = next;
		}
	} 
	/** Returns the Fibonacci value at zero-based position {@code n} recursively. */
	public static int fibonacciWithRecur(int n) {
	    if (n <= 1) {
	    	return n;
	    }
	    return fibonacciWithRecur(n - 1) + fibonacciWithRecur(n - 2);

	}
	/** Prints the first {@code n} Fibonacci values using recursion. */
	public static void printFibonacciWithRecursion(int n) {
		System.out.println("Fibonacci Numbers using recursion");
		for (int i = 0; i < n; i++) {
			System.out.print(fibonacciWithRecur(i) + " ");
		}
	}

	/** Reads a count and displays the sequence using both approaches. */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of n : ");
		int n = sc.nextInt();
		printFibonacciWithIteration(n);
		System.out.println();
		printFibonacciWithRecursion(n);
		sc.close();
	}

}
