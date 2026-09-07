package solid_design_principal.DependencyInversionPrincipal;

public class MongoDB implements DBPersistence {
    @Override
    public void saveToDB() {
        System.out.println("Data saved to MongoDB Database");
    }
}
