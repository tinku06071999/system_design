package solid_design_principal.OCP;

import java.util.Map;

public class PrintInvoice {
    ShoppingCart shoppingCart = new ShoppingCart();

    public PrintInvoice(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }


//    public void print(){
//        System.out.println("Products List /n");
//        System.out.println("Product Name\t\t Quantity\t\t Price");
//        for(Map.Entry<ProductOcpViolation,Integer>entry: shoppingCart.products.entrySet()){
//            System.out.println(entry.getKey().getProductName() + "\t\t\t" + entry.getValue() + "\t\t" + entry.getKey().getProductPrice());
//        }
//
//    }

// Design a method to print the invoice in a formatted way
    public void print() {

        System.out.println("==============================================================");
        System.out.println("                     SHOPPING CART INVOICE                    ");
        System.out.println("==============================================================");
        System.out.printf("%-25s %-10s %-10s %-10s%n",
                "PRODUCT NAME", "QTY", "PRICE", "TOTAL");
        System.out.println("--------------------------------------------------------------");

        double grandTotal = 0;

        for (Map.Entry<ProductOcpViolation, Integer> entry : shoppingCart.products.entrySet()) {

            String productName = entry.getKey().getProductName();
            int quantity = entry.getValue();
            double price = entry.getKey().getProductPrice();
            double total = quantity * price;

            grandTotal += total;

            System.out.printf("%-25s %-10d %-10.2f %-10.2f%n",
                    productName, quantity, price, total);
        }

        System.out.println("--------------------------------------------------------------");
        System.out.printf("%-47s %-10.2f%n", "GRAND TOTAL :", grandTotal);
        System.out.println("==============================================================");
        System.out.println("               Thank You For Shopping With Us!               ");
        System.out.println("==============================================================");
    }
}
