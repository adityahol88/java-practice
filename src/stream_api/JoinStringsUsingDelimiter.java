/**
 * Problem: Given an ordered list of city names, join them into a formatted
 * travel path using an arrow delimiter.
 */
package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/** Demonstrates joining stream elements with a delimiter and surrounding text. */
public class JoinStringsUsingDelimiter {

	/** Returns the values joined with {@code " -> "} and enclosed in brackets. */
	String makePath(List<String> list) {
		
		return list.stream().collect(Collectors.joining(" -> ","[ "," ]"));
	}
	
	/** Builds a sample city list and displays the joined travel path. */
	public static void main(String[] args) {
		List<String> cities = new ArrayList<>(Arrays.asList("Mumbai","Pune","Delhi","Hyderabad"));
		
		System.out.println("Travel Path is ");
		JoinStringsUsingDelimiter path = new JoinStringsUsingDelimiter();
		System.out.println();
		System.out.println(path.makePath(cities));
	}
}
