public class Product {

    // Static variable shared by all products
    static int totalProducts = 0;

    // Instance variables
    String name;
    double price;
    int quantity;

    // 1. No-argument constructor
    Product() {
        name = "Unknown";
        price = 0;
        quantity = 0;
        totalProducts++;
    }

    // 2. Parameterized constructor
    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        totalProducts++;
    }

    // 3. Copy constructor
    Product(Product other) {
        this.name = other.name;
        this.price = other.price;
        this.quantity = other.quantity;
        totalProducts++;
    }

    // Calculate total stock value of this product
    double stockValue() {
        return price * quantity;
    }

    // Display product information
    void display() {
        System.out.println(
            name + " | Rs " + price + " | qty " + quantity
        );
    }
}