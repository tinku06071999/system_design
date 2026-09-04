package solid_design_principal.OCP;

public class ShoppingCartStorage{
    ShoppingCart shoppingCart = new ShoppingCart();

    public ShoppingCartStorage(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void saveSqlDB() {
        System.out.println("Saving invoice to SQL database");
    }
    //Now we have a new requirement to save the product to a MongoDB database, we need to modify the ProductOcpViolation class to add a
    // new method for saving to MongoDB. This violates the OCP principle because we are modifying the existing class to add new functionality,
    // instead of extending it.
    // same things happens when new method of saving to a new database is added, we need to modify the ProductOcpViolation class again, which
    // violates the OCP principle.
    public void saveMongoDB(){
        System.out.println("Saving product to MongoDB database");
    }

    // TO solve this problem, we can create a new interface called DBPersistence and create two classes that implement this interface,
    // one for saving to SQL database and another for saving to MongoDB database. This way, we can extend the functionality of the
    // ShoppingCartStorage class without modifying it.
}