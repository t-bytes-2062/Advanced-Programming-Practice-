import java.util.Scanner;

abstract class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    abstract double calculateDiscount();

    void display() {
        double discount = calculateDiscount();
        double finalPrice = price - discount;

        System.out.println("Product: " + name);
        System.out.println("Price: ₹" + price);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Price: ₹" + finalPrice);
        System.out.println();
    }
}

class Electronics extends Product {
    Electronics(String name, double price) {
        super(name, price);
    }

    double calculateDiscount() {
        return price * 0.10;
    }
}

class Clothing extends Product {
    Clothing(String name, double price) {
        super(name, price);
    }

    double calculateDiscount() {
        return price * 0.20;
    }
}

class Books extends Product {
    Books(String name, double price) {
        super(name, price);
    }

    double calculateDiscount() {
        return price * 0.15;
    }
}

public class ProductDemo {
    public static void main(String[] args) {

        Product p1 = new Electronics("Laptop", 50000);
        Product p2 = new Clothing("Shirt", 2000);
        Product p3 = new Books("Java Book", 1000);

        p1.display();
        p2.display();
        p3.display();
    }
}
