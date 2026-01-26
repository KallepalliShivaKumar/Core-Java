package com.shiva.introduction.CollectionVsCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_unmodifiableListMethod {

	public static void main(String[] args) 
	{

		List<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(90);
		list.add(78);
		
		IO.println(list);
		
		List<Integer> fixedList = Collections.unmodifiableList(list);
		IO.println(fixedList);
		
		//fixedList.add(40); // UnsupportedOperationException
		
	/*

	 * What is unmodifiableList()?

		- unmodifiableList() returns a read-only view of a list
		- unmodifiableList does NOT create a new list	
		- You cannot add, remove, or modify elements
		- Any modification operation throws UnsupportedOperationException
		- It protects a list from modification through a reference.
		- The original list still exists and can change
	 */

		
		
		// Is the list completely immutable?
			list.add(1);
			IO.println(fixedList);
			
			/* NO, Because 
			 *  unmodifiableList is only a view
				It reflects changes made to the original list
				It only prevents modification through that reference
			 * 
			 */
			
			
	}

}
