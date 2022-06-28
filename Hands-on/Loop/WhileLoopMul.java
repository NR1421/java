package corejava;

import java.util.Scanner;

public class WhileLoopMul {

	public static void main(String[] args) {
		int mn=2 ;
		int un;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
				un=sc.nextInt();
			
			int i=1;
			while(i<=10)
			{
				System.out.println(mn+"*"+un+"*"+i+"="+mn*un*i);
				i++;
			}
			sc.close();
	}
}