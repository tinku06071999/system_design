package solid_design_principal.DependencyInversionPrincipal;

public class Main {

    public static void main(String[] args) {
        // Before applying Dependency Inversion Principle
        System.out.println("Before applying Dependency Inversion Principle");
        SaveToSqlDB saveToSqlDB = new SaveToSqlDB();
        saveToSqlDB.saveToDB();
        SaveToMongoDB saveToMongoDB = new SaveToMongoDB();
        saveToMongoDB.saveToDB();

        // After applying Dependency Inversion Principle
        System.out.println("After applying Dependency Inversion Principle");
        DBPersistence dbPersistence = new CasandraDB();
        dbPersistence.saveToDB();
        dbPersistence = new MongoDB();
        dbPersistence.saveToDB();
    }
}
