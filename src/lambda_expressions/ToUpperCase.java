package lambda_expressions;


import java.util.Scanner;
import java.util.function.Function;

public class ToUpperCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string - ");

		String str = sc.nextLine();

		Function<String,String> upperCase = string -> string.toUpperCase();
		
		System.out.println("Given string in upper case is " + upperCase.apply(str));
		sc.close();
	}
}
