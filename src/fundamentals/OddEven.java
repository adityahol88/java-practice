/**
 * Problem: Read an integer and determine whether it is odd or even.
 */
package fundamentals;

import java.util.Scanner;

/** Classifies an integer according to divisibility by two. */
public class OddEven {
	/** Returns {@code true} when {@code number} is even. */
	static boolean isEven(int number) {
		return number % 2 == 0;
	}

	/** Reads a number and prints whether it is odd or even. */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter to number to check : ");
		int number = sc.nextInt();
		if(isEven(number))
			System.out.println("Given Number is Even ");
		else
			System.out.println("Given Number is Odd");
		sc.close();
		
	}
}
