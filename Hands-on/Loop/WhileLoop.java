//WAP to accept input from user and use while loop to print multiplication of that number(int data type)

package corejava;

//import scanner class
import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		// Creating object of scanner class
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number : ");
		
		// Taking input from user 
		int Num = sc.nextInt();
		int i=1;
		
		// While loop
		while(i <= 10){
			
			System.out.println(Num + " X " + i + " = " + Num*i);
			i++;
			
		}

	}

}