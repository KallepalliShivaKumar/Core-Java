package com.shiva.SimpleExceptionDemo;
import java.lang.NumberFormatException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExceptionDemo
{

    public static void main(String[] args) {
        // Use a try-with-resources to ensure the scanner closes
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.println("Enter a value : ");
            
            String x = sc.nextLine();
           
            if (x.isEmpty()) {
                
                throw new NullPointerException();
            }
          
            int a = Integer.parseInt(x);
            
            System.out.println("Enter b value : ");
            int b = sc.nextInt();
            
            System.out.println("You entered a = " + a + " and b = " + b + ".");
            
        }
        catch (InputMismatchException e) 
        {
            System.out.println("InputMismatchException occurred. Please enter only integer numbers.");
        } 
        catch (NullPointerException e) 
        {
            System.out.println("NullPointerException occurred. You didn't enter anything!");
        }
        catch (NumberFormatException e) 
        {
            System.out.println("Error: The first value entered was not a valid number.");
        } 
        catch (Exception e) 
        {
            System.out.println("General Problem: " + e.getMessage());
        }
    }
}