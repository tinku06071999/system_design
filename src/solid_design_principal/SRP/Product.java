// this is an example of Single Responsibility Principle (SRP) violation in Java. The Product class has a single
// responsibility of representing a product, while the shoppingCart class has a single responsibility of managing
// the shopping cart and calculating the total price.
// The shoppingCart class also has a method to print the invoice and save it to the database,
// but these methods are not related to the responsibility of the shoppingCart class,
// so they should be moved to a separate class.
// SRP states that a class should have only one reason to change, and in this case,
// the shoppingCart class has multiple reasons to change, so it violates the SRP principle.
// TO fix this violation, we can create a separate class for printing the invoice and saving it
// to the database, and the shoppingCart class will only be responsible for managing the shopping
// cart and calculating the total price.
package solid_design_principal.SRP;

public class Product {
    String productName;
    double productPrice;

    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }
}
class shoppingCart {
    Product product;
    int quantity;

    public shoppingCart(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double calculateTotalPrice() {
        return product.productPrice * quantity;
    }
    public void printInvoice() {
        System.out.println("Product: " + product.productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + calculateTotalPrice());
    }
    public void saveDB() {
        // code to save invoice to database
    }
}
