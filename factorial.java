package javapgm;
import java.util.*;
public class factorial {
	public static void main ( String [] args ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Limit:");
		int n = sc.nextInt();
		
		sc.close();
		
		int fact = 1;
		
		if ( n < 0 ) {
			System.out.println("Error");
		}else if ( n==1 || n==0 ) {
			System.out.println("The Factorial of the Number " +n +" is " +1);
		}else {

			for ( int i = 1; i <= n; i++ ) {
				fact = fact * i;
			}
			System.out.println("The Factorial of the Number " +n +" is " +fact);
		}
	}
}
