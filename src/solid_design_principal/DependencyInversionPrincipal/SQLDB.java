package solid_design_principal.DependencyInversionPrincipal;

public class SQLDB implements DBPersistence {
    @Override
    public void saveToDB() {
        System.out.println("Data saved to SQL Database");
    }
}
