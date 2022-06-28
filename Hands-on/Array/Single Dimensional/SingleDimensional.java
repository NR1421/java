package corejava;

//Java Program to illustrate how to declare, instantiate, initialize  
//and traverse the Java array.  
class OneDimensional {  

public static void main(String args[]){  

	String a[]=new String[5];//declaration and instantiation  

		a[0]=" Rohan";//initialization  

		a[1]=" Shubham";  

		a[2]=" Omkar";  

		a[3]=" Tejas";  

		a[4]=" Yogita";  

//traversing array  
for(int i=0;i<a.length;i++)//length is the property of array  
	System.out.println(a[i]);  
	}
}