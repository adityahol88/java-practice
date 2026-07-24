package fundamentals;

import java.util.Scanner;

public class LargestOfThree {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter three numbers to check : ");
	int n1 = sc.nextInt();
	int n2 = sc.nextInt();
	int n3 = sc.nextInt();
	double largest = Double.NEGATIVE_INFINITY;
	largest = Math.max(n1, n2);
	largest = Math.max(largest, n3);
	System.out.println("Largest number is : " + (int) largest);
	sc.close();
	}
}
