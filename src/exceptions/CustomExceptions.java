package exceptions;

import java.util.Scanner;

class InvalidAgeException extends Exception {
	
	 private static final long serialVersionUID = 1L;

	 InvalidAgeException(String message) {
	 super(message);	
	}
}

class UserProfile{
	
	String name="temp";
	int age;
	final void setAge(int age) throws InvalidAgeException {
		if(age < 18) {
			throw new InvalidAgeException("User must be at least 18 years old.") ;
		}
		this.age = age;
	}
	
}


public class CustomExceptions {

	public static void main(String[] args) {
		UserProfile p1 = new UserProfile();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age of user");
		try {
			p1.setAge(sc.nextInt());
		    System.out.println("Registration successful.");
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
}
}