package solid_design_principal.DependencyInversionPrincipal;

public class CasandraDB implements DBPersistence {
    @Override
    public void saveToDB() {
        System.out.println("Data saved to Casandra Database");
    }
}
