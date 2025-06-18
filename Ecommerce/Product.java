package Ecommerce;
public class Product {
    String name;
    double price;
    int quantity;

    public Product() {}

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotal() {
        return price * quantity;
    }

    public void displayProduct() {
        System.out.println("Product Name: " + name);
        System.out.println("Unit Price: ₹" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Subtotal: ₹" + getTotal());
        System.out.println("--------------------------");
    }
}
