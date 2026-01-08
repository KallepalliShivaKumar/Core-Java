package com.shiva.SimpleExceptionDemo;

public class ArithmeticExceptionDemo
{
    // Method to perform division
    public static int performDivision(int dividend, int divisor)
    {
        if (divisor == 0)
        {
            throw new ArithmeticException(
                "Division by zero: dividend=" + dividend + ", divisor=" + divisor
            );
        }
        return dividend / divisor;
    }

    public static void main(String[] args)
    {
        try
        {
            IO.println("Input as : ");

            int dividend = Integer.parseInt(IO.readln("Enter dividend : "));
            int divisor  = Integer.parseInt(IO.readln("Enter divisor : "));

            int result = performDivision(dividend, divisor);

            IO.println("Result : " + result);
        }
        catch (ArithmeticException e)
        {
            IO.println("ArithmeticException caught: " + e.getMessage());
        }
    }
}
