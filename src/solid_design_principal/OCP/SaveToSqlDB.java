package solid_design_principal.OCP;

public class SaveToSqlDB implements DBPersistence {
    @Override
    public void saveToDB(ShoppingCart shoppingCart) {
        System.out.println("Saving to SQL Database");
    }
}
