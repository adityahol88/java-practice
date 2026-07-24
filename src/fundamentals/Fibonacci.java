package fundamentals;

import java.util.Scanner;

public class Fibonacci {
	
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
	public static int fibonacciWithRecur(int n) {
	    if (n <= 1) {
	    	return n;
	    }
	    return fibonacciWithRecur(n - 1) + fibonacciWithRecur(n - 2);

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of n : ");
		int n = sc.nextInt();
		printFibonacciWithIteration(n);
		System.out.println();
	    System.out.println("Fibonacci Numbers using recursion");

	    for (int i = 0; i < n; i++) {
	        System.out.print(fibonacciWithRecur(i) + " ");
	    }
		sc.close();
	}

}
