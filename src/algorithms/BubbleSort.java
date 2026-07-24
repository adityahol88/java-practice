package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	
	static void bubbleSort(int []arr) {
		for(int i=0; i<arr.length-1; i++) {
			
			for(int j=0; j<arr.length-i-1; j++) {
			
				if(arr[j] > arr[j+1]) {
					
					arr[j] = arr[j] ^ arr[j+1];
				
					arr[j+1] = arr[j] ^ arr[j+1];
					
					arr[j] = arr[j] ^ arr[j+1];
				}
			}
		}
		
		System.out.println("sorted arrat in ascending order using bubble sort is : ");
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
	}
}
