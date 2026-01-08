package com.shiva.ArrayList.OnlineCabBookingSystem;

public class CabCustomerServiceTester {

    public static void main(String[] args) {

        
        CustomerService service = new CustomerService();

        
        Customer john1 = new Customer(
                101,
                "John",
                "Hyderabad",
                "Ameerpet",
                10,
                "9876543210"
        );

        service.printBill(john1);   
        service.addCustomer(john1);

       
        Customer smith = new Customer(
                102,
                "Smith",
                "Hyderabad",
                "Madhapur",
                8,
                "9123456789"
        );

        service.printBill(smith);   
        service.addCustomer(smith);

       
        Customer john2 = new Customer(
                103,
                "John",
                "Ameerpet",
                "Gachibowli",
                14,
                "9876543210" 
        );

        service.printBill(john2);
    }
}
