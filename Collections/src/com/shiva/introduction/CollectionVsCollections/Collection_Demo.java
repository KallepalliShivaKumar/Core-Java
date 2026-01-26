package com.shiva.introduction.CollectionVsCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Collection_Demo
{

	public static void main(String[] args)
	{
		Collection<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		
		IO.println(numbers);
		
		/*
		 * Here Collection is an interface.
		 * 
		 * numbers is a reference variable of type
		   Collection that refers to an ArrayList object.
			        
			         numbers (Collection reference)
				        |
				        ↓
				  ArrayList object
				  ----------------
				  | 10 | 20 | 30 |
				  ----------------
				  
				  
				Its declared type is Collection<Integer>
				
				You can call only Collection interface methods on it
				
				This is polymorphism
		 * 
		 */
	
	}

}
