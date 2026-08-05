/**
 * Problem: Given a list of strings, use streams to display the values in
 * case-insensitive ascending and descending alphabetical order.
 */
package stream_api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/** Demonstrates ascending and descending stream sorting of strings. */
public class SortStrings {

	/** Returns the strings in case-insensitive ascending order. */
		public List<String> sortStringsAscending(List<String> list){
			
			return list.stream().sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.toList());
		}
		/** Returns the strings in case-insensitive descending order. */
		public List<String> sortStringsDescending(List<String> list){
			
			return list.stream().sorted((a,b)->b.compareToIgnoreCase(a)).collect(Collectors.toList());
			
			/** Other ways - 
			 * list.stream().sorted(String.CASE_INSENSITIVE_ORDER.reversed()).collect(Collectors.toList());
			 * list.stream().sorted(String.CASE_INSENSITIVE_ORDER.reversed()).toList();  Java 16
			 */
		}
		
		
		/** Builds a sample list and displays both sorted orderings. */
		public static void main(String[] args) {
			
			List<String> list=new ArrayList<>(Arrays.asList("Stream","fast","taken","to","major","used","in","spring"));
			SortStrings  sortStrings = new SortStrings();
			
			List<String> ascendingSortedList = sortStrings.sortStringsAscending(list);
			
			System.out.println("Original list is \n" + list);
			System.out.println();
			System.out.println("Sorted list of strings in alphabetical order is \n" + ascendingSortedList);
			System.out.println();
			List<String> descendingSortedList = sortStrings.sortStringsDescending(list);
			
			System.out.println("Sorted list of strings in descending alphabetical order is \n" + descendingSortedList);
			
		}

}
