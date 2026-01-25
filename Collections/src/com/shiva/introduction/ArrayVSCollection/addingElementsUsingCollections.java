package com.shiva.introduction.ArrayVSCollection;

import java.util.ArrayList;

public class addingElementsUsingCollections 
{

	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Mango");
		list.add("Grapes");
		
		IO.println(list);

		/*
		 * Size can grow and shrink dynamically.
		 * Easy to add , remove, search data.
		 * Memory Cannot be wasted or insufficent.
		 */
	}

}
