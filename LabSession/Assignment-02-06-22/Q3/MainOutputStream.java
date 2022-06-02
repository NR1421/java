// java program for demonstrate File output stream.
package corejava;

import java.io.FileOutputStream;

public class MainOutputStream {
	// main Drive
	public static void main(String[] args) {
		try {
			        //creating file output object.			
			  FileOutputStream fout=new FileOutputStream("C:\\RohanOut.txt");    
			        // With Integer Data type
	                fout.write(55);  
	                fout.close(); 
	                //printing the output
	                System.out.println("Welcome to coding world");    
	             
	            }  
	               	catch(Exception e){System.out.println(e);}
	      }    
	} 