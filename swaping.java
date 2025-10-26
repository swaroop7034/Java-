package javapgm;
import java.util.*;
public class swaping {
	public static void main ( String [] args ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number:");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number:");
		int num2 = sc.nextInt();
		
		int temp;
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("First Number:" +num1 +" Second Number:" +num2);
		sc.close();
	}
}
