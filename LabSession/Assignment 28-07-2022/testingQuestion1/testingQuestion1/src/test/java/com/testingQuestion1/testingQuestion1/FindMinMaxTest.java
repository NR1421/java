package com.testingQuestion1.testingQuestion1;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class FindMinMaxTest {

	
	FindMinMax minMax;
	@Test
	public void testFindMinMax(){
	
		
			minMax = new FindMinMax();
			int arr[] = {5, 8, 2, 9};		
			int expected[] = {2, 9};
			int actual[] = minMax.findMinMax(arr);
			assertTrue(Arrays.equals(expected, actual));
			//assertEquals(expected, actual);
			//testing array arr1
			int arr1[] = {51, -82, 0, 9};
			//array of expected result
			int expected1[] = {-82, 51};
			assertTrue(Arrays.equals(expected1, minMax.findMinMax(arr1)));
			//testing array arr2
			int arr2[] = {0, 0, 0, 0};
			//array of expected result
			int expected2[] = {0, 0};
			assertTrue(Arrays.equals(expected2, minMax.findMinMax(arr2)));
			
		
	}

	

}
