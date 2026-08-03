package lambda_expressions;

import java.util.Scanner;
import java.util.function.BiFunction;


public class SumOfTwoIntegrs {

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
