/**
 * Problem: Given a list of integers, use stream reduction to calculate and
 * display the sum of all values.
 */
package stream_api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** Demonstrates summing integer values with stream reduction. */
public class SumOfIntegers {

	/** Returns the sum of all integers in {@code list}. */
		public int sumOfIntegers(List<Integer> list){
			
			return list.stream().reduce(0,Integer::sum);
		}
		
		/** Builds a sample list and displays its sum. */
		public static void main(String[] args) {
			
			List<Integer> list=new ArrayList<>(Arrays.asList(5,3,1,5,71,100));
			SumOfIntegers toUpper = new SumOfIntegers();
			
			int sum = toUpper.sumOfIntegers(list);
			
			System.out.println("Original integers list is " + list);
			System.out.println();
			System.out.println("Addition of above integers is " + sum);
		}

}
