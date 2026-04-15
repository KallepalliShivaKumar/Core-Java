package com.shiva.toStringMethod;

class Laptop {

    int price = 50000;

    public static void main(String[] args) {
        Laptop obj = new Laptop();
        System.out.println(obj);
    }

    @Override
    public String toString() {
        return "Laptop price = " + price;
    }
}
/**
 * Here the output is com.shiva.toStringMethod.Laptop@f6f4d33
 * 
 * com.shiva.toStringMethod is the package name. Laptop is the Class name. @ is
 * the separator. f6f4d33 is the Hexa decimal hash code of the object.
 * 
 * “When we print an object, Java automatically calls the toString() method. If
 * the class does not override it, the default toString() method from the Object
 * class is used.”
 */