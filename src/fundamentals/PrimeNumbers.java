/**
 * Problem: Print every prime number in the inclusive range from 1 through 100.
 */

package fundamentals;

/** Demonstrates prime testing and range-based prime generation. */
public class PrimeNumbers {
	
	/** Returns whether {@code n} has no divisor other than 1 and itself. */
   static boolean isPrime(int n) {
	   if (n <= 1)
		   return false;
	   for(int i=2;i<=Math.sqrt(n);i++) {
		   if(n%i==0)
			   return false;
	   }
	   return true;
   }
	/** Prints all prime numbers from {@code start} through {@code end}. */
	static void printPrimeNumbers(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

	/** Prints all prime numbers between 1 and 100. */
	public static void main(String[] args) {
		System.out.println("Prime numbers between 1 to 100 are : ");
		printPrimeNumbers(2, 100);
}
}
