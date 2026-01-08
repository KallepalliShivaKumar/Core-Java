package com.shiva.SimpleExceptionDemo;

public class ClassCastExceptionDemo
{
    // Static method with no parameters and void return type
    public static void handleClassCastException()
    {
        // Object array with different data types
        Object[] objects = {
                "Java",
                Integer.valueOf(10),
                Double.valueOf(25.5),
                Character.valueOf('A'),
                Boolean.TRUE
        };

        // Iterate through the array
        for (Object obj : objects)
        {
            try
            {
                // Attempt to cast each object to String
                String str = (String) obj;
                System.out.println("Successfully casted to String: " + str);
            }
            catch (ClassCastException e)
            {
                System.out.println("Failed to cast object of type "
                        + obj.getClass().getName() + " to String.");

                
                e.printStackTrace();
            }

            System.out.println("-----------------------------------");
        }
    }

    public static void main(String[] args)
    {
        handleClassCastException();
    }
}

