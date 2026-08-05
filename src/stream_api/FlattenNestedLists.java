/**
 * Problem: Given a nested list of integers, use the Stream API to flatten it
 * into one list while preserving encounter order.
 */
package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/** Demonstrates flattening nested collections with {@code flatMap}. */
public class FlattenNestedLists {
	
	
	/** Returns one list containing all values from the nested {@code list}. */
	public List<Integer> flattenList(List<List<Integer>> list){
		
		return list.stream().flatMap(item -> item.stream()).collect(Collectors.toList());
	}

	/** Builds a sample nested list and displays its flattened form. */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<List<Integer>> matrix = new ArrayList<>();

        // 2. Declare, populate, and add the first inner list
        List<Integer> row1 = new ArrayList<>();
        row1.add(10);
        row1.add(20);
        matrix.add(row1);

        // 3. Declare, populate, and add the second inner list
        List<Integer> row2 = new ArrayList<>();
        row2.add(30);
        row2.add(50);
        matrix.add(row2);
        FlattenNestedLists fnl = new FlattenNestedLists();
        System.out.println("Original nested list " + matrix);
        System.out.println("Flattened list is \n");
        System.out.println(fnl.flattenList(matrix));
        
        
	
	}

}
