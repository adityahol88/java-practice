/**
 * Problem: Given a list of strings, use a stream mapping operation to create
 * and display a list with every string converted to uppercase.
 */
package stream_api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/** Demonstrates transforming strings with the stream {@code map} operation. */
public class StringsToUppercase {

	/** Returns a new list containing the uppercase form of each string. */
		public List<String> listUppercase(List<String> list){
			
			return list.stream().map(word -> word.toUpperCase()).collect(Collectors.toList());
		}
		
		/** Builds a sample list and displays its uppercase projection. */
		public static void main(String[] args) {
			
			List<String> list=new ArrayList<>(Arrays.asList("Stream","fast","taken","to","major","used","in","spring"));
			StringsToUppercase toUpper = new StringsToUppercase();
			
			List<String> uppercasedWords = toUpper.listUppercase(list);
			
			System.out.println("Original list is " + list);
			System.out.println();
			System.out.println("Uppercased list is " + uppercasedWords);
		}

}
