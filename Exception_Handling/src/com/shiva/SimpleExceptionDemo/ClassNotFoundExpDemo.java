package com.shiva.SimpleExceptionDemo;
import java.util.Scanner;

public class ClassNotFoundExpDemo
{
    // Constructor with String parameter
    public ClassNotFoundExpDemo(String className)
    {
        Class<?> cls;

        try
        {
            // Attempt to load the class dynamically
            cls = Class.forName(className);
            System.out.println("Class loaded successfully: " + cls.getName());
        }
        catch (ClassNotFoundException e)
        {
            // User-friendly error message
            System.out.println("Error: Class '" + className + "' not found.");

            // Print stack trace for debugging
            e.printStackTrace();
        }
    }

    // Main method
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the class name to load: ");
        String className = sc.nextLine();

        // Call constructor
        new ClassNotFoundExpDemo(className);

        sc.close();
    }
}
