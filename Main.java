
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array to store maximum 10 products
        Product[] products = new Product[10];

        // Number of products currently stored
        int count = 0;
        int choice;

        do {
            // Display menu
            System.out.println("\n--- Campus Cafe Inventory ---");
            System.out.println("1. Add product");
            System.out.println("2. Display all products");
            System.out.println("3. Total stock value");
            System.out.println("4. Average price");
            System.out.println("5. Restock a product");
            System.out.println("6. Duplicate a product");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            choice = sc.nextInt();
            sc.nextLine();

            if (choice < 0 || choice > 6) {
                System.out.println("Invalid choice, try again.");
            }

            switch (choice) {

                // OPTION 1: Add product
                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Quantity: ");
                    int quantity = sc.nextInt();
                    sc.nextLine();

                    if (count == 10) {
                        System.out.println("Inventory is full!");
                    }
                    else if (price <= 0 || quantity < 0) {
                        System.out.println("Invalid price or quantity!");
                    }
                    else {
                        products[count] =
                            new Product(name, price, quantity);

                        count++;
                        System.out.println("Product added successfully!");
                    }
                    break;

                // OPTION 2: Display all products
                case 2:
                    if (count == 0) {
                        System.out.println("No products available.");
                    }
                    else {
                        for (int i = 0; i < count; i++) {
                            System.out.print((i + 1) + ". ");
                            products[i].display();
                        }
                    }
                    break;

                // OPTION 3: Calculate total stock value
                case 3:
                    if (count == 0) {
                        System.out.println("No products available.");
                    }
                    else {
                        double total = 0;

                        for (int i = 0; i < count; i++) {
                            total += products[i].stockValue();
                        }

                        System.out.println(
                            "Total stock value: Rs " + total
                        );
                    }
                    break;

                // OPTION 4: Calculate average price
                case 4:
                    if (count == 0) {
                        System.out.println("No products available.");
                    }
                    else {
                        double sum = 0;

                        for (int i = 0; i < count; i++) {
                            sum += products[i].price;
                        }

                        double average = sum / count;

                        System.out.println(
                            "Exact average: " + average
                        );

                        System.out.println(
                            "Rounded down: " + (int) average
                        );
                    }
                    break;

                // OPTION 5: Restock a product
                case 5:
                    System.out.print("Product number: ");
                    int num = sc.nextInt();

                    System.out.print("Quantity to add: ");
                    int extra = sc.nextInt();
                    sc.nextLine();

                    if (num < 1 || num > count || extra <= 0) {
                        System.out.println("Invalid input!");
                    }
                    else {
                        products[num - 1].quantity += extra;

                        System.out.println(
                            "Product restocked successfully!"
                        );
                    }
                    break;

                // OPTION 6: Duplicate a product
                case 6:
                    System.out.print("Product number: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    if (count == 10) {
                        System.out.println("Inventory is full!");
                    }
                    else if (n < 1 || n > count) {
                        System.out.println("Invalid product number!");
                    }
                    else {
                        Product copy =
                            new Product(products[n - 1]);

                        copy.name = copy.name + " (copy)";

                        products[count] = copy;
                        count++;

                        System.out.println(
                            "Product duplicated successfully!"
                        );
                    }
                    break;

                // OPTION 0: Exit
                case 0:
                    System.out.println("Goodbye!");
                    break;
            }

        } while (choice != 0);

        System.out.println(
            "Products created in total: " + Product.totalProducts
        );

        sc.close();
    }
}
