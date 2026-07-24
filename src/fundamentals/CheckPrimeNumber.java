package fundamentals;

import java.util.Scanner;

public class CheckPrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter to number to check : ");
		int n = sc.nextInt();
		if(n==1) {System.out.println("1 is neither prime nor composite");System.exit(0);}
		for(int i=2;i<Math.sqrt(n);i++) {
			if(n % 2 == 0) {
				System.out.printf("Given Number %d is not a prime number\n",n);
				System.exit(0);
			}
		}
		System.out.printf("Given Number %d is a prime number", n);
		sc.close();
	}
}
