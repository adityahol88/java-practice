/**
 * Problem: Given a list of integers, partition the values into even and odd
 * groups using the Stream API and display both groups.
 */
package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/** Demonstrates boolean partitioning with {@code partitioningBy}. */
public class PartitionEvenOddNumbers {

	/** Builds a sample list and displays its even and odd partitions. */
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(4,2,3,6,7,5));
		Map<Boolean, List<Integer>> partition = numbers.stream().collect(
				Collectors.partitioningBy(	
				number -> number % 2==0 ));
		Set<java.util.Map.Entry<Boolean, List<Integer>>> entry = partition.entrySet();
		for(java.util.Map.Entry<Boolean, List<Integer>> entr:entry) {
			System.out.println(entr.getKey() + " -> " + entr.getValue());
		}
		
		// or we can write like this 
		System.out.println();
		System.out.println("Even numbers: " + partition.get(true));
		System.out.println("Odd numbers: " + partition.get(false));
	}

}
