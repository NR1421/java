package corejava;

import java.util.*;

public class MultiDimensional {

	public static void main(String args[]){  

		//declaration and initialization For MultiDimensionalArray
		
		int len; int len2; //Length of Array
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Array Length: ");
		len = sc.nextInt();
		System.out.print("Enter Array Length: ");
		len2 = sc.nextInt();
		
		int a[][]= new int[len][len2];
		System.out.print("\nEnter: "+ len + " Elements To Store In Array\n");
		
		for (int i=0; i<len;i++) {
			for (int j=0; j<len;j++)
			a[i][j]=sc.nextInt();
		}
		System.out.print("\n");

		//Printing Array
	for(int i=0;i<3;i++) {
		
		for (int j=0;j<3;j++) 
			
			System.out.print(a[i][j]+ " ");  
		
		System.out.println( );  
		}
	}
	}