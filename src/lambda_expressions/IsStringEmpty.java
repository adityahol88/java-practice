/**
 * Problem: Read a string and use a predicate lambda expression to determine
 * whether it is empty.
 */
package lambda_expressions;

import java.util.Scanner;
import java.util.function.Predicate;

/** Demonstrates empty-string validation with a {@link Predicate} lambda. */
public class IsStringEmpty {

	/** Reads a string, evaluates the predicate, and prints the result. */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string to check - ");

		String str = sc.nextLine();
		Predicate<String> isEmpty = string -> string.isEmpty();
		if(isEmpty.test(str)) {
			System.out.println("Given string is Empty");
		}
		else {
			System.out.println("Given string is not empty ");
		}
sc.close();
	}
}
