/**
 * Problem: Given a list of integers, use the Stream API to create and display
 * a list containing only the even values.
 */
package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/** Demonstrates filtering integer values with a stream predicate. */
public class FilterEvenNums {

	/** Returns a new list containing only the even values from {@code list}. */
	public  List<Integer> evenNumbers(List<Integer> list){
		
		return list.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
	}
	
	/** Builds a sample list and displays its even-number projection. */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<>(Arrays.asList(4,1,2,5,72,0,2));
		FilterEvenNums evenNums = new FilterEvenNums();
		List<Integer> even = evenNums.evenNumbers(list);
		System.out.println("Original list is " + list);
		System.out.println("Even Numbers list is " + even);
	}

}
