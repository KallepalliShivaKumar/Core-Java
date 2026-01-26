package com.shiva.introduction.CollectionVsCollections;

import java.util.*;

public class Collections_Demo 
{
	public static void main(String[] args) {
		
//Collections is a helper class that provides utility methods to operateon collection objects.
			
		List<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(90);
		list.add(78);
		
//Methods of Collections Class

		
		// Sort()
		
			Collections.sort(list);
			IO.println(list);
			
//			✔ Sorts list in ascending order
//			✔ Works on List, not Set directly
			
	
			
		// Reverse()	
			
			Collections.reverse(list);
			IO.println("\n"+list);
			
	    // max()
			
			int a = Collections.max(list);
			IO.println("\n"+a);
			
	     // min()
			
			int b = Collections.min(list);
			IO.println("\n"+b);
			
		 // shuffle()
			
			Collections.shuffle(list);
			IO.println("\n"+list); 		//Random order (used in games, quizzes)
			
		// frequency()
			
			list.add(90);
			IO.println("\n"+list);
			
			int count = Collections.frequency(list, 90);
			IO.println(count); // how many times does the element is existed.
		
			// see another methods in next Class file
			
			

	}
	
}
