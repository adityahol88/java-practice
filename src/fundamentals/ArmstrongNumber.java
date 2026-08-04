/**
 * Problem: Read a three-digit integer and determine whether it equals the sum
 * of the cubes of its digits (the Armstrong-number rule used here).
 */
package fundamentals;

import java.util.Scanner;
/** Checks whether an input number is an Armstrong number. */
public class ArmstrongNumber {

	/** Returns whether {@code number} equals the sum of the cubes of its digits. */
	static boolean isArmstrong(int number) {
		int n = number;
		int sum = 0;
		while (n > 0) {
			int currentDigit = n % 10;
			sum += Math.pow(currentDigit, 3);
			n /= 10;
		}
		return sum == number;
	}

	/** Reads a number, evaluates it with {@link #isArmstrong(int)}, and prints the result. */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter to number to check : ");
		int number = sc.nextInt();
		if(isArmstrong(number))
			System.out.printf("Given Number %d is an Armstrong number", number);
		else
			System.out.printf("Given Number %d is not an Armstrong number", number);
			
		sc.close();
	}
}
