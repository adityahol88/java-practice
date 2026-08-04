/**
 * Problem: Read an integer and calculate the sum of all its decimal digits.
 */
package fundamentals;

import java.util.Scanner;

/** Calculates the digit sum of an input number. */
public class SumOfDigits {

	/** Returns the sum of the decimal digits in {@code number}. */
	static int sumOfDigits(int number) {
		int n = number;
		int sum = 0;
		while (n > 0) {
			int currentDigit = n % 10;
			sum += currentDigit;
			n /= 10;
		}
		return sum;
	}

	/** Reads a number, sums its digits, and prints the result. */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter to number to check : ");
		int number = sc.nextInt();
		System.out.println("Sum of digits of Number "+ number + " is : "+ sumOfDigits(number));
			
		sc.close();
	}
}
