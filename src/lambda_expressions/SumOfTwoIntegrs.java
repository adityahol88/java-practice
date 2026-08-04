/**
 * Problem: Read two integers and calculate their sum with a
 * {@link java.util.function.BiFunction} lambda expression.
 */
package lambda_expressions;

import java.util.Scanner;
import java.util.function.BiFunction;


/** Demonstrates addition with a binary lambda function. */
public class SumOfTwoIntegrs {

	/** Reads two integers, applies the sum function, and prints the result. */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers to sum - ");

		Integer num1 = sc.nextInt();
		Integer num2 = sc.nextInt();
		
		BiFunction<Integer,Integer,Integer> sumTwoNum =(a,b) -> a+b;
		
		System.out.println("Sum of given two numbers is - " + sumTwoNum.apply(num1,num2));
		sc.close();

	}

}
