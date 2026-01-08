package com.shiva.ArrayList.OnlineCabBookingSystem;

import java.util.ArrayList;

public class CustomerService
{
	private ArrayList<Customer>customers;
	
	public CustomerService()
	{
		customers = new ArrayList<>();
	}
	
	public void addCustomer(Customer customer)
	{
		customers.add(customer);
	}
	
	private boolean isFirstCustomer(Customer customer)
	{
	    for (Customer existingCustomer : customers)
	    {
	        if (existingCustomer.phone().equals(customer.phone()))
	        {
	            return false; // pre-existing customer
	        }
	    }
	    return true; // new customer
	}
	
	public double calculateBill(Customer customer) 
	{
	    if (isFirstCustomer(customer))
	    {
	        return 0.0;
	    }
	    int distance = customer.distance();

	    if (distance <= 4) 
	    {
	        return 80.0;
	    }  
	    return 80.0 + (distance - 4) * 6;
	}	
	public void printBill(Customer customer) 
	{
	    double bill = calculateBill(customer);
	    System.out.println
	    (
	        customer.customerName().toUpperCase() +
	        " Please pay your bill of Rs." + bill
	    );
	}

}


