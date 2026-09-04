package solid_design_principal.OCP;

public class Main {
    public static void main(String[] args) {
        ProductOcpViolation product1 = new ProductOcpViolation("HP ELiteBook Laptop", 12199.00);
        ProductOcpViolation product2 = new ProductOcpViolation("Apple MacBook Pro", 173999.00);
        ProductOcpViolation product3 = new ProductOcpViolation("Dell XPS 13", 39999.00);
        ProductOcpViolation product4 = new ProductOcpViolation("Apple Iphone 17 Pro Max", 149999.00);

        ShoppingCart shopppingCart = new ShoppingCart();
        shopppingCart.addProduct(product1, 1);
        shopppingCart.addProduct(product2, 1);
        shopppingCart.addProduct(product3, 1);
        shopppingCart.addProduct(product4, 1);

        PrintInvoice printInvoice = new PrintInvoice(shopppingCart);
        printInvoice.print();
        shopppingCart.calculateTotalPrice();

        ShoppingCartStorage shoppingCartStorage = new ShoppingCartStorage(shopppingCart);
        shoppingCartStorage.saveSqlDB();
        shoppingCartStorage.saveMongoDB();

        // OCP following example
        ProductOcpViolation product5 = new ProductOcpViolation("Samsung Galaxy S23 Ultra", 119999.00);
        ProductOcpViolation product6 = new ProductOcpViolation("OnePlus 11 Pro", 69999.00);
        ProductOcpViolation product7 = new ProductOcpViolation("Google Pixel 7 Pro", 89999.00);

        shopppingCart.addProduct(product5, 1);
        shopppingCart.addProduct(product6, 1);
        shopppingCart.addProduct(product7, 1);

        PrintInvoice printInvoice2 = new PrintInvoice(shopppingCart);
        printInvoice2.print();
        shopppingCart.calculateTotalPrice();

        SaveToSqlDB newSaveToSqlDB = new SaveToSqlDB();
        newSaveToSqlDB.saveToDB(shopppingCart);

        SaveToMongoDB newSaveToMongoDB = new SaveToMongoDB();
        newSaveToMongoDB.saveToDB(shopppingCart);

    }

}
