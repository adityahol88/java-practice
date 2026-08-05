/**
 * Problem: Given a list of integers and a target value, find the first even
 * number greater than the target, or report that no such value exists.
 */

package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

/** Demonstrates filtering and finding the first matching stream element. */
public class FilterPractice {
	
	/** Returns the first even value in {@code list} greater than {@code target}. */
	Optional<Integer> findFirst(List<Integer> list,int target){
		
		return list.stream().filter(number -> number > target && number %2==0).findFirst();	
	}

	/** Reads a target value and displays the first matching list element. */
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(5,1,5,100,44,22,18));
		FilterPractice filter = new FilterPractice();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to know above : ");
		int target = sc.nextInt();
		Optional<Integer>  number = filter.findFirst(list,target);
		
		if (number.isPresent()) {

		    System.out.printf("First even number greater than %d is %d" ,target, number.get());

		} else {

		    System.out.printf("No even number greater than %d found.",target);

		}
		sc.close();
	}

}
