// java program for demonstrate buffered input stream
package corejava;

import java.io.*;

import java.io.BufferedInputStream;

public class BufferedINS {
	 //Main driver 
    public static void main(String[] args) throws IOException {  
        FileInputStream data = new FileInputStream("D:\\Ro.txt");  
        //creating file for class
        BufferedInputStream  file = new BufferedInputStream(data);  
        //creating object for class
        BufferedInputStream Buffer = new BufferedInputStream(file);  
        int k =0;  
        while((k=Buffer.read())!=-1){ 
        	//printing the output
            System.out.print((char)k);  
        }  
        file.close();  
        Buffer.close();  
    }  
}
