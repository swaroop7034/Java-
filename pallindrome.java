package javapgm;
import java.util.*;
public class pallindrome {
	public static void main ( String [] args ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String to Check if it is Palindrome:");
		String str = sc.nextLine();
		
		sc.close();
		int flag = 0;
		str = str.toLowerCase();
		
		for ( int i = 0; i < str.length();  i++ ) {
			if ( str.charAt(i) != str.charAt(str.length() - i - 1 ) ) {
				flag = 1;
				break;
			}
		}
		
		if ( flag == 1 ) {
			System.out.println("It is not Palindrome.");
		}else {
			System.out.println("It is pallindrome.");
		}
 	}
}
