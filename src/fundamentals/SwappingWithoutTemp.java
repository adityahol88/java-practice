package fundamentals;

import java.util.Scanner;

public class SwappingWithoutTemp {
	
	
	
	public static void main(String[] args) {
		System.out.print("Enter two numebers to swap seperated by space: ");
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		first = first^second;
		second = first^second;
		first = first^second;
		System.out.println("Two swapped numbers are " + first + " " + second );
		sc.close();
		
	}

}
