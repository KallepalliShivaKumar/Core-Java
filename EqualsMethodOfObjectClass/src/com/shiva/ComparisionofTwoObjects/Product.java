package com.shiva.ComparisionofTwoObjects;

import java.util.Objects;

public class Product 
{
	private int productId;
	private String productName;
	
	public Product(int productId, String productString) {
		
		this.productId = productId;
		this.productName = productString;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj)
		{
			return true;  
		}
	    if (obj == null)
		{
			return false;
					
		}
		
		if (!(obj instanceof Product)) 
		{
           IO.println("Comparison not possible: Object is not of Product type");
            return false;
        }
		
		 Product other = (Product) obj;
		 
		return this.productId == other.productId &&
	               Objects.equals(this.productName, other.productName);
	    }
	@Override
    public int hashCode() {
        return Objects.hash(productId, productName);
		
	}
	
	
}
