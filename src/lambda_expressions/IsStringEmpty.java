package lambda_expressions;

import java.util.Scanner;
import java.util.function.Predicate;

public class IsStringEmpty {

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
