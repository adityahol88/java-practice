package fundamentals;

import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter to number to check : ");
		int number = sc.nextInt();
		int n=number;
		int sum = 0;
		while(n > 0) {
			int currentDigit = n % 10;
			sum+=(Math.pow(currentDigit, 3));
			n/=10;
		}
		
		if(sum==number)
			System.out.printf("Given Number %d is an Armstrong number", number);
		else
			System.out.printf("Given Number %d is not an Armstrong number", number);
			
		sc.close();
	}
}
