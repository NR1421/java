//java program for demonstrate file input stream
package corejava;

import java.io.FileInputStream;

public class Main { 
   // main drive
  public static void main(String args[]) {

     try {
    	 //creating file input object
        FileInputStream input = new FileInputStream("C://Rohan.txt");

        int i = input.read();
        //printing the output
        System.out.println("Data in the file: ");
       while(i != -1) {
           System.out.print((char)i);
          
           i = input.read();
        }
        input.close();
     }

     catch(Exception e) {
       
     }
  }
}