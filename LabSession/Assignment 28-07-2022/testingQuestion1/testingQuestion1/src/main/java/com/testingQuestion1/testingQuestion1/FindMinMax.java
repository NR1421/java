package com.testingQuestion1.testingQuestion1;

/**
 * Hello world!
 *
 */
public class FindMinMax 
{
public int[] findMinMax(int []arr) {
		
		int[] arr1 = new int[2];
		//initializing variable minn and maxx
		int minn = arr[0];
		int maxx = arr[0];
		//using for loop for traversing an array
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<minn)
				minn = arr[i];
			else if(arr[i]>maxx)
				maxx = arr[i];
		}
		
		arr1[0] = minn;
		arr1[1] = maxx;
		
		return arr1;
	}
	public static void main(String[] args) {
		int value[]= {2,3,45,64,};
		FindMinMax mf = new FindMinMax();
		mf.findMinMax(value);
	}
}
