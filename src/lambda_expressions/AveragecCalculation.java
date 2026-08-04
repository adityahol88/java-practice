/**
 * Problem: Read a list of decimal numbers and calculate its average using a
 * {@link java.util.function.Function} lambda expression.
 */
package lambda_expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;


/** Demonstrates calculating an average with a lambda expression. */
public class AveragecCalculation {

	/** Reads decimal values, applies the average function, and prints the result. */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Double> list=new ArrayList<>();
		System.out.print("How many numbers? - ");

		int n = sc.nextInt();

		System.out.println("Enter numbers :");
		for (int i = 0; i < n; i++) {
		    list.add(sc.nextDouble());
		}
		Function<List<Double>,Double> averageCalculator = (numbers) -> {
			double sum = 0;
		    for (Double num : numbers) {
		        sum += num;
		    }
		    return sum / list.size();	
		};
		
		System.out.println("Average of given numbers is " + averageCalculator.apply(list));
	sc.close();
	}
}
