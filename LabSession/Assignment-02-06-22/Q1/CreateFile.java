// create a file in java using exception handling
package corejava;

 import java.io.File;
 
public class CreateFile {

	public static void main(String[] args) {
		try {
			// create object
			File file= new File ("D:\\CreateFile.txt");
			// calling the method using if loop
			if(file.createNewFile()) {
				//Print
				System.out.println("Done");
			}
			else {
				//print
				System.out.println("not done");
			}
		}catch(Exception e){System.out.println(e);}
		
		}
}
		
			
			
		
	

	


