package fundamentals;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter to number to check : ");
		int number = sc.nextInt();
		if(number % 2 == 0)
			System.out.println("Given Number is Even ");
		else
			System.out.println("Given Number is Odd");
		sc.close();
		
	}
}