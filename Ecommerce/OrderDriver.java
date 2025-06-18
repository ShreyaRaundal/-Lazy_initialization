package Ecommerce;

public class OrderDriver {
    public static void main(String[] args) {
        Order o1 = new Order("Shreya", 1001);

        o1.addProduct("Laptop", 60000.0, 1);
        o1.addProduct("Wireless Mouse", 1000.0, 2);
        o1.addProduct("USB Cable", 300.0, 3);

        o1.displayOrder();
    }
}

