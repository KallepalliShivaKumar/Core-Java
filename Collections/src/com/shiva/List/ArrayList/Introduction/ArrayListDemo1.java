package com.shiva.List.ArrayList.Introduction;

import java.util.ArrayList;

public class ArrayListDemo1 
{

	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		IO.println(list);	
	}
}

/* 🔹 What is List?

- List is a sequence of elements
- Maintains insertion order
- Allows duplicate values
- Elements are accessed using index
- Index starts from 0

🔹 Why not use Array directly?
 
 Array problems:

- Size is fixed
- Cannot grow
- Cannot shrink

Array advantages:

- Fast access
- Index-based

🔹 What is ArrayList?

- ArrayList is a List implementation
- Internally uses a dynamic array
- Array size grows automatically
- Provides fast access using index

🔹 Very Important Concept (Core Idea ⭐)

👉 We store elements in List, not in array
👉 The array is an internal private implementation
👉 We are not allowed to access the array directly

🔹 Real-Life Example (Easy to remember)

🏦 Bank Example

You deposit money in a bank
Bank stores money in lockers
Lockers are internal
You only interact with the bank

Similarly:

We add elements to List
List stores elements in internal array
Array is private
Java manages it

🔹 Final One-Line Summary (Very Important)

Elements are logically stored in List
Physically stored in an internal array

**/
