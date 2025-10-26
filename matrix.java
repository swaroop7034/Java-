package javapgm;
import java.util.*;
public class matrix {
	public static void main ( String [] args ) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the number of Rows and Columns for the First Matrix Respectively:");
		int row1 = sc.nextInt();
		int col1 = sc.nextInt();
		
		System.out.println("Enter the number of Rows and Columns for the Second Matrix Respectively:");
		int row2 = sc.nextInt();
		int col2 = sc.nextInt();
		
		int [][] matrix1 = new int[row1][col1];
		int [][] matrix2 = new int[row2][col2];
		int [][] result =  new int[row1][col2];
		
		System.out.println("Enter the values for the First Matrix:");
		for( int i = 0; i < row1; i++ ) {
			for( int j = 0; j < col1; j++ ) {
				matrix1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the values for the Second Matrix:");
		for( int i = 0; i < row2; i++ ) {
			for( int j = 0; j < col2; j++ ) {
				matrix2[i][j] = sc.nextInt();
			}
		}
		
		if( col1 != row2 ) {
			System.out.println("Matrix Multiplication is not possible:");
			System.exit(1);
		}else {
			for( int i = 0; i < row2; i++ ) {
				for( int j = 0; j < col2; j++ ) {
					result[i][j] = 0;
					for( int k = 0; k < col1; k++ ) {
						
						result [i][j] += matrix1[i][k] * matrix2[k][j];
					}
				}
			}
			
			System.out.println("The resultant Matrix is :");
			for( int i = 0; i < row1; i++ ) {
				for( int j = 0; j < col2; j++ ) {
					System.out.print( +result[i][j] +" ");
				}
				System.out.println();
			}
			
		}
		
	}
}
