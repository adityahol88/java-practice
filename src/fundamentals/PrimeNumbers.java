// Write a program to print prime numbers between 1 to 100 

package fundamentals;

public class PrimeNumbers {
	
   static boolean isPrime(int n) {
	   for(int i=2;i<Math.sqrt(n);i++) {
		   if(n%i==0)
			   return false;
	   }
	   return true;
   }
	public static void main(String[] args) {
		System.out.println("Prime numbers between 1 to 100 are : ");
	   for(int i=2;i<=100;i++) {
		   if(isPrime(i))
			   System.out.print(i + " ");
	   }
}
}
