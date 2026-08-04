/**
 * Problem: Read an integer and determine whether it is prime; report that 1
 * is neither prime nor composite.
 */
package fundamentals;

import java.util.Scanner;


/** Checks primality by testing possible divisors up to the square root. */
public class CheckPrimeNumber {
	/** Returns whether {@code n} is a prime number. */
	static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	/** Reads a number and prints whether it is prime. */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter to number to check : ");
		int n = sc.nextInt();
		if (n == 1) {
			System.out.println("1 is neither prime nor composite");
		} else if (isPrime(n)) {
			System.out.printf("Given Number %d is a prime number", n);
		} else {
			System.out.printf("Given Number %d is not a prime number\n", n);
		}
		sc.close();
	}
}
