package strings;

import java.util.Scanner;

public class VowelsConsonantsCount {
	
	static int[] vowelsConsonantsCount(String s) {
	int vowels = 0;
	int consonants = 0;
	for (int i = 0; i < s.length(); i++) {
	    char ch = Character.toLowerCase(s.charAt(i));
	    if (Character.isLetter(ch)) {
	        if ("aeiou".indexOf(ch) != -1)
	            vowels++;
	        else
	            consonants++;
	    }

	}
	return new int[]{vowels,consonants};
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String s = sc.nextLine();
		int[] counts = vowelsConsonantsCount(s);
		System.out.println("Vowels: " + counts[0]);

		System.out.println("Consonants: " + counts[1]);
		sc.close();
	}
}
