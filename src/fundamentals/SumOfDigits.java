package fundamentals;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter to number to check : ");
		int number = sc.nextInt();
		int n=number;
		int sum = 0;
		while(n > 0) {
			int currentDigit = n % 10;
			sum+=currentDigit;
			n/=10;
		}
		
		System.out.println("Sum of digits of Number "+ number + " is : "+ sum);
			
		sc.close();
	}
}
