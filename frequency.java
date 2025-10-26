package javapgm;
import java.util.*;
public class frequency {
	public static void main( String [] args ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		
		int freq = 0;
		
		System.out.println("Enter the Character to search:");
		char ch = sc.next().charAt(0);
		
		for ( int i = 0; i < str.length(); i++ ) {
				if ( ch == str.charAt(i) ) {
					freq = freq + 1;
				}
		}
		System.out.println("Frequency of the the Character " +"'"+ch+"'" +" in the string is " +freq);
		sc.close();
	}
}
