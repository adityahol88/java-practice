package fundamentals;

import java.util.Scanner;

public class Factorial {
	
	
	static void calculateFactorialWithIteration(long n) {
		long val = 1;
		for(long i=2;i<=n;i++) {
			val *=i;
		}
		System.out.println("factorial of n using iteration is : " + val);
	}
	public static long calculateFactorialWithRecursion(long n) {
	    if (n <= 1)
	        return 1;
	    return n * calculateFactorialWithRecursion(n - 1);
	}
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number to calculate factorial: ");
		long n = sc.nextInt();
		calculateFactorialWithIteration(n);
		long ans  = calculateFactorialWithRecursion(n);
		System.out.println("Factorial of n using recursion is : " + ans);
		sc.close();
	}

}
