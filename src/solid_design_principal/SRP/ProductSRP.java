// This code demonstrates the Single Responsibility Principle (SRP) in Java.
// Each class has a single responsibility, making the code easier to maintain and understand.
//for example, the ProductSRP class is responsible for representing a product, the ShoppingCart class
// is responsible for managing the shopping cart and calculating the total price,
// the addProduct class is responsible for adding products to the shopping cart,
// the printInvoice class is responsible for printing the invoice, and
// the saveDB class is responsible for saving the invoice to the database.

// VVIP Note: SRP does not mean that a class should have only one method, but rather that a class should have only one reason to change.
// In this case, each class has a single responsibility, and if any of these responsibilities change, only the corresponding class will
// need to be modified, making the code easier to maintain and understand.
// a class can have multiple methods as long as they are related to the same responsibility or they all are doing the same thing.
// for example, a class can have multiple methods can there are more methods as helper methods to the main method of the class,
// but all the methods should be related to the same responsibility or they all are doing the same thing.

package solid_design_principal.SRP;

public class ProductSRP {
    String productName;
    double productPrice;

    public ProductSRP(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }
}
class ShoppingCart {
    ProductSRP product;
    int quantity;

    public ShoppingCart(ProductSRP product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double calculateTotalPrice() {
        return product.productPrice * quantity;
    }
}
class addProduct {
    ShoppingCart shoppingCart;

    public addProduct(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void add(ProductSRP product) {
        // code to add product to shopping cart
    }
}
class printInvoice {
    ShoppingCart shoppingCart;

    public printInvoice(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void print() {
        System.out.println("Product: " + shoppingCart.product.productName);
        System.out.println("Quantity: " + shoppingCart.quantity);
        System.out.println("Total Price: " + shoppingCart.calculateTotalPrice());
    }
}
class saveDB {
    ShoppingCart shoppingCart;

    public saveDB(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void save() {
        // code to save invoice to database
    }
}

