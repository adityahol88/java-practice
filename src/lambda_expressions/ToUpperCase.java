/**
 * Problem: Read a string and convert it to uppercase with a
 * {@link java.util.function.Function} lambda expression.
 */
package lambda_expressions;


import java.util.Scanner;
import java.util.function.Function;

/** Demonstrates string transformation with a lambda function. */
public class ToUpperCase {

	/** Reads a string, converts it to uppercase, and prints the result. */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string - ");

		String str = sc.nextLine();

		Function<String,String> upperCase = string -> string.toUpperCase();
		
		System.out.println("Given string in upper case is " + upperCase.apply(str));
		sc.close();
	}
}
