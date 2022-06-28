package corejava;

import java.util.*;

public class ArrayUserSort{

    public static void main(String[] args)
    {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter Array Length: ");
	
	Integer len = sc.nextInt();
	
	Integer a[]= new Integer[len];
	System.out.print("\nEnter: "+ len + " Elements To Store In Array\n");
	
	for (int i=0; i<len;i++) {
		a[i]=sc.nextInt();
	}
	
        Arrays.sort(a);
        System.out.println("In Ascending Order Modified arr[] : \n"+Arrays.toString(a));

        // Sorts arr[] in descending order
        Arrays.sort(a, Collections.reverseOrder());

        // Lastly printing the above array
        System.out.println("\n In descending Order Modified arr[] : \n"+Arrays.toString(a));
    }
}