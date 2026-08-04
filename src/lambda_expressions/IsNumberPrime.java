/**
 * Problem: Read an integer and use a predicate lambda expression to determine
 * whether it is prime.
 */
package lambda_expressions;

import java.util.Scanner;
import java.util.function.Predicate;

/** Demonstrates prime-number validation with a {@link Predicate} lambda. */
public class IsNumberPrime {

	/** Reads a number, evaluates the predicate, and prints the result. */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to check - ");

		Integer n = sc.nextInt();
		// Lambda function to check if given number is prime 
		Predicate<Integer> isPrime = (number) -> {

		    if (number <= 1)
		        return false;
		    
		    int limit = (int)Math.sqrt(number);
		    for (int i = 2; i <= limit; i++) {
		        if (number % i == 0)
		            return false;
		    }
		    return true;

		};
		if(isPrime.test(n)) {
			System.out.println("Given number is Prime");
		}
		else {
			System.out.println("Given number is not a Prime Number ");
				
		}
		sc.close();
		
	}
}
