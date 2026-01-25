package com.shiva.introduction.ArrayVSCollection;

import java.util.Arrays;

public class addingElementsUsingArray {

	public static void main(String[] args)
	{
		int [] arr = new int[2];
		arr[0] = 10;
		arr[1] = 20;

		// arr[2] = 30;  // would cause ArrayIndexOutOfBoundsException 
				
				/*
				 * Array size is fixed.
				 * Cannot grow or shrink.
				 **/
		
		IO.println(arr + "\n");
		/* Printing an array object directly does NOT print its elements.
		 * Java prints:
		 * <classname>@<hashcode>
		 * [ → means array
		 * I → means int
		 * @f6f4d33 → memory hashcode
		 * 
		 * 
		 * Why elements are NOT printed?
			Because:
			println(arr) calls toString()
			Arrays do not override toString()
			So Java prints the object reference, not contents
		 **/
		
		// Using loop
		for (int i = 0; i < arr.length; i++)
		{
		    System.out.println(arr[ i]);
		}
		
		//Using Arrays.toString()
		System.out.println( "\n" + Arrays.toString(arr));
		
		String [] arr1 = new String[10];
		arr1[0] ="Train";
		arr1[1] = "Bus";
		arr1[2] = "Car";
		
		IO.println("\n"+ Arrays.toString(arr1)); // Memory can be wasted or insufficent
				
	}

}
