package com.shiva.Function.Product;

import java.util.function.Function;

public class CalculateProductDiscount {

	public static void main(String[] args) 
	{
		int id = Integer.parseInt(IO.readln("Enter the Product id : "));
		String name = IO.readln("Enter the Product name : ");
		Double price = Double.parseDouble(IO.readln("Enter the Product price : "));

		Product product = new Product(id,name,price);
		
		Function<Product,Double> discountFunction = (p) ->
		{
			double originalprice= p.price();
			double finalprice = 0;
			
			if(originalprice >= 5000 )
			{
				 finalprice = originalprice-(originalprice*0.10);
			}
			else if (price < 5000)
			{
				finalprice = originalprice-(originalprice*0.05);
			}
			
			return finalprice;
						
		};	
		Double discountedPrice = discountFunction.apply(product);
		
		IO.println("The final discounted price is : "+ discountedPrice);
		
		
	}

	
}
