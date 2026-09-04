package solid_design_principal.OCP;

import solid_design_principal.SRP.ProductSRPViolation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProductOcpViolation {  // this claas is a product class which is responsible for representing a product.
    String productName;
    double productPrice;

    public ProductOcpViolation(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }
}


