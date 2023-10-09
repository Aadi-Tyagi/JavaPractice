package Week2.ecommerce;

public class Order {
    private Customer customer;
    private ShoppingCart cart;

    public Order(Customer customer, ShoppingCart cart){
        this.customer = customer;
        this.cart = cart;
    }
    public void printDetails() {
        customer.printDetails();
        System.out.println("Order Details:");
        cart.printDetails();
        System.out.println("-----");
    }
}
