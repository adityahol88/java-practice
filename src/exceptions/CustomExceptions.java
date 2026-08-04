/**
 * Problem: Accept a user's age and reject registration with a custom checked
 * exception when the age is below 18.
 */
package exceptions;

import java.util.Scanner;

/** Indicates that a supplied age does not meet the minimum requirement. */
class InvalidAgeException extends Exception {
	
	 private static final long serialVersionUID = 1L;

	/** Creates an exception with a descriptive validation message. */
	 InvalidAgeException(String message) {
	 super(message);	
	}
}

/** Stores a user's basic profile information and validates the age. */
class UserProfile{
	
	String name="temp";
	int age;
	/** Sets the age when it is at least 18; otherwise throws an exception. */
	final void setAge(int age) throws InvalidAgeException {
		if(age < 18) {
			throw new InvalidAgeException("User must be at least 18 years old.") ;
		}
		this.age = age;
	}
	
}


/** Demonstrates declaring, throwing, and catching a custom exception. */
public class CustomExceptions {

	/** Reads an age and reports whether registration succeeds. */
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
