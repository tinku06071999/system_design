package solid_design_principal.OCP;

public class SaveToMongoDB implements DBPersistence {
    @Override
    public void saveToDB(ShoppingCart shoppingCart) {
        System.out.println("Saving to MongoDB Database");
    }
}
