package com.shiva.Supplier.RandomPassword;

import java.util.Random;
import java.util.function.Supplier;

public class PasswordGenerator 
{

	public static void main(String[] args) 
	{
		 String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 String lower = "abcdefghijklmnopqrstuvwxyz";
		 String digits = "0123456789";
		 String special = "@#$%!&*";
		 
		 String allChars = upper + lower + digits + special;
		 
		 
		 Supplier<String> passwordSupplier = ()->
		 {
			 Random random = new Random();
			 StringBuilder password = new StringBuilder();
			 
			 for (int i = 0; i < 8; i++) 
			 {
	                int index = random.nextInt(allChars.length());
	                password.append(allChars.charAt(index));
	         }
			 return password.toString();
			 
		 };
		 String generatedPassword = passwordSupplier.get();
	        System.out.println("Generated Password: " + generatedPassword);

	}

}
