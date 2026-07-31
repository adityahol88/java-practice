package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class FrequencyCount {
	
	public static void frequencyCount(ArrayList<Integer> list) {
		HashSet<Integer> done=new HashSet<>();
		for (int i = 0; i < list.size(); i++) {
			Integer cur = list.get(i);
		    if (done.contains(cur)) {
		        continue;
		    }
		    int count = 1;
			for(int j=i+1;j<list.size();j++) {
				if(list.get(j).equals(cur)) {
					count++;
			}
			}
			System.out.println("Frequency of element "+ cur +" is "+ count);
			done.add(cur);
		}
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();

		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();

		System.out.println("Enter " + n + " integers:");

		for (int i = 0; i < n; i++) {
		    list.add(sc.nextInt());
		}
		frequencyCount(list);
		sc.close();
	}
}
