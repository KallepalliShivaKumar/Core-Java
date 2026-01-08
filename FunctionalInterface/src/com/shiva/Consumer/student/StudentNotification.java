package com.shiva.Consumer.student;

import java.util.function.Consumer;

public class StudentNotification 
{

	public static void main(String[] args) 
	{
		int n = Integer.parseInt(IO.readln("Enter the Number of Students : "));
	
		Consumer<Student> notificationConsumer = (student)-> 
		{
			IO.println(
					"Hello "+ student.name()+
					" ! Welcome to the "+student.course() +" course." 
					);
			
		};
		
		for (int i=1; i<=n; i++)
		{
			IO.println("\n Enter the details of the Student " + i +":");
			
			int id = Integer.parseInt(IO.readln("Enter Id : "));
			String name = IO.readln("Enter Name : ");
			String course = IO.readln("Enter Course : ");
			
			 	
			Student student = new Student (id,name,course);
			
			notificationConsumer.accept(student);
			
			
		}	

	}

}
