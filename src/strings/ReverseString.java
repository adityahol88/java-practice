package strings;
import java.util.Scanner;

public class ReverseString {
	
	static String reverseString(String s) {

	    StringBuilder reversed = new StringBuilder(s.length());
	    for (int i = s.length() - 1; i >= 0; i--) {
	        reversed.append(s.charAt(i));
	    }
	    return reversed.toString();

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to reverse: ");
		String s = sc.nextLine();
		String reversed = reverseString(s);
		System.out.println("reversed string is :" + reversed);
		sc.close();
	}
}
