// WAP in java to accept age int value from user and check whether age >=18 the the person is eligible for vote. else not eligible
package corejava;

// import scanner class
import java.util.Scanner;

public class IfLoop {

	public static void main(String[] args) {
		
		//Creating object of scanner class
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your age : ");
		// taking input from user
		int Age = sc.nextInt();
		//if loop
		if(Age > 18 ) {
			
			System.out.println("You are eligible for Voting....");
		}
		else {
			System.out.println("You are not eligible for Voting !!!!");
		}

		
	}

}