package corejava;
// java program to delete repeat array
import java.util.ArrayList;
import java.util.Scanner;

public class DeleteRepeatArray {
	
	       //creating static method
	public static Character[] k;
	public static void main(String[] args)throws Exception {
		
		   //creating object of Scanner class
		try (               
		var sc = new Scanner(System.in)) {
			char[] arr=new char[4];
			System.out.println("Array before deleting duplicates");
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.next().charAt(0);
				System.out.println("a["+i+"] = "+arr[i]);
				
			}
			
			System.out.println("SIze: "+arr.length);
			System.out.println("Array after deleting duplicates : ");
			int size=deleteRepeats(arr);
			for(int i=0;i<size;i++) {
				System.out.println("a["+i+"] = "+k[i]);
				
			}
		}
		System.out.println("Final Size: "+k.length);
		

	}
	
	//Creating static method
	public static int deleteRepeats(char[] arr) {
		ArrayList<Character>lis=new ArrayList<Character>();
		for(int i=0;i<arr.length;i++) {
			if(lis.contains(arr[i])) {
				continue;
			}
			else{
				lis.add(arr[i]);
				
			}
		}
		k=new Character[lis.size()];
		k=lis.toArray(k);
		return k.length;
	}

}