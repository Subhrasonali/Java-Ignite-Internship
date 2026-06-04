/*
EASY
Mobile Details System

Create a class Mobile:

Attributes:
brand
price
storage
Tasks:
Use constructor to initialize values
Create 2 mobile objects
Display details using method
Twist:

Price must be private and only shown via method.
  */
package Day7.Day7;

class Mobile {
    String brand;
    String storage;
    private double price;

    Mobile(String brand, String storage, double price) {
        this.brand = brand;
        this.storage = storage;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Storage: " + storage);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class MobileDetails {
    public static void main(String[] args) {

        Mobile m1 = new Mobile("Samsung", "128GB", 25000);
        Mobile m2 = new Mobile("OnePlus", "256GB", 35000);

        m1.displayDetails();
        m2.displayDetails();
    }
}