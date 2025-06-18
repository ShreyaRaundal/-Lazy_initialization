package Ecommerce;

import java.util.ArrayList;

public class Order {
    String customerName;
    int orderId;
    ArrayList<Product> products = new ArrayList<>();

    public Order() {}

    public Order(String customerName, int orderId) {
        this.customerName = customerName;
        this.orderId = orderId;
        System.out.println("Order placed for " + customerName);
    }

    public void addProduct(String name, double price, int quantity) {
        Product p = new Product(name, price, quantity);
        products.add(p);
        System.out.println("Added product: " + name);
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);
        System.out.println("-------- Order Details --------");
        double total = 0;
        for (Product p : products) {
            p.displayProduct();
            total += p.getTotal();
        }
        System.out.println("Total Amount: ₹" + total);
        System.out.println("=================================");
    }
}

