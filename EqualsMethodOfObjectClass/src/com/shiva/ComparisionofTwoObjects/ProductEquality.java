package com.shiva.ComparisionofTwoObjects;

public class ProductEquality {

    public static void main(String[] args) {

        Product p1 = new Product(101, "Laptop");
        Product p2 = new Product(101, "Laptop");

        // Comparing content using equals()
        if (p1.equals(p2)) {
            System.out.println("Both Product objects are equal");
        } else {
            System.out.println("Both Product objects are NOT equal");
        }

        // Verifying equals-hashCode contract
        System.out.println("HashCode of p1: " + p1.hashCode());
        System.out.println("HashCode of p2: " + p2.hashCode());
    }
}

