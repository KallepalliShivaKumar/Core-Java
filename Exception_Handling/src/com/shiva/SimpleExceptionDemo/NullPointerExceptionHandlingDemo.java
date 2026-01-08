package com.shiva.SimpleExceptionDemo;

import java.util.Scanner;
import java.lang.NumberFormatException;

public class NullPointerExceptionHandlingDemo
{

   
    public static void handleExceptions(String input)
    {
        try 
        {
            System.out.println("Length of the input string: " + input.length());
            int convertedValue = Integer.parseInt(input);
            System.out.println("Converted to integer: " + convertedValue);

            
            System.out.println("Uppercase version: " + input.toUpperCase());

        } 
        catch (NullPointerException e) 
        {
            System.out.println("NullPointerException: Input is null.");
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("NumberFormatException: Input is not a valid integer.");
        }
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        
        if (userInput.equalsIgnoreCase("null")) 
        {
            handleExceptions(null);
        } 
        else
        {
            handleExceptions(userInput);
        }

        scanner.close();
    }
}