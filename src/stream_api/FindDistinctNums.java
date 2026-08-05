/**
 * Problem: Given a list containing duplicate integers, use the Stream API to
 * display each distinct value once.
 */
package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/** Demonstrates removing duplicate values with the {@code distinct} operation. */
public class FindDistinctNums {
	/** Creates a sample list and prints its distinct values. */
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>(Arrays.asList(5,5,1,5,71,71,100));
		System.out.println("Distint numbers in list " + list + " are \n");
		System.out.println(list.stream().distinct().toList());		
	}
}
