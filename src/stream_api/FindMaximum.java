/**
 * Problem: Given a list of integers, use a stream reduction to find and
 * display the maximum value.
 */
package stream_api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** Demonstrates finding an aggregate maximum with stream reduction. */
public class FindMaximum {

	/** Returns the greatest integer in {@code list}. */
		public int getMax(List<Integer> list){
			
			return list.stream().reduce(Integer.MIN_VALUE,(a,b)-> Math.max(a, b));
			// another way - list.stream().reduce(Integer.MIN_VALUE,Integer::max); method reference 
		}
		
		/** Builds a sample list and displays its maximum value. */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			List<Integer> list=new ArrayList<>(Arrays.asList(5,3,1,5,71,100));
			FindMaximum getmax = new FindMaximum();
			
			int sum = getmax.getMax(list);
			
			System.out.println("Original integers list is " + list);
			System.out.println();
			System.out.println("Maximum value among above integers is " + sum);
		}

}
