/**
 * Problem: Given a list of words, group them by their character length using
 * the Stream API and display the resulting map.
 */
package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/** Demonstrates grouping stream elements with {@code groupingBy}. */
public class GroupStringsByLength {

	/** Builds a sample word list and displays groups keyed by word length. */
	public static void main(String[] args) {
		List<String> animals = new ArrayList<>(Arrays.asList("Cat","Dog","Lion","Tiger","elephant","Fish"));
		
		System.out.println("grouped by length of words ");
		System.out.println();
		System.out.println(animals.stream().collect(Collectors.groupingBy(String::length)));
	}

}
