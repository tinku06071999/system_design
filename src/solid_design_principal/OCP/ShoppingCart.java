package solid_design_principal.OCP;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    ProductOcpViolation product;
    int quantity;
    Map<ProductOcpViolation, Integer> products = new HashMap();

    public ShoppingCart(){};

    public ShoppingCart(ProductOcpViolation product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    public void addProduct(ProductOcpViolation product, int quantity) {
        products.put(product, quantity);
    }

    public int getQuantity() {
        return quantity;
    }

    public void calculateTotalPrice() {
        int totalPrice = 0;
        for(Map.Entry<ProductOcpViolation, Integer> entry: products.entrySet()){
            totalPrice += entry.getKey().getProductPrice() * entry.getValue();
        }
        System.out.println("Total Price: " + totalPrice);
    }
}
