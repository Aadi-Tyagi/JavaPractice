package Week2.ecommerce;

import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args) {

        // Create a customer
        Customer customer = new Customer("John Doe");

        // Create a shopping cart
        ShoppingCart shoppingCart = createShoppingCart();

        // Place an order
        Order order = new Order(customer, shoppingCart);

        order.printDetails();

    }
    private static ShoppingCart createShoppingCart() {
        ShoppingCart shoppingCart = new ShoppingCart();

        // Get user input for adding products
        Scanner scanner = new Scanner(System.in);
        char addMoreProducts;

        do {
            // Get product details from user
            System.out.print("Enter product name: ");
            String productName = scanner.nextLine();

            System.out.print("Enter product price: ");
            double productPrice = scanner.nextDouble();
            scanner.nextLine();

            // Create the product and add it to the shopping cart
            Product product = new Product(productName, productPrice);
            shoppingCart.addProduct(product);

            // Ask if the user wants to add more products
            System.out.print("Do you want to add more products? (y/n): ");
            addMoreProducts = scanner.nextLine().charAt(0);

        } while (addMoreProducts == 'y' || addMoreProducts == 'Y');

        return shoppingCart;
    }
}
