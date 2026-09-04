package solid_design_principal.OCP;

// This interface is used to define the contract for saving data to a database.
// It allows for different implementations of database persistence, such as saving to SQL or MongoDB,
// without modifying the existing code that uses this interface. This adheres to the
// Open/Closed Principle (OCP) by allowing the system to be open for extension but closed for modification.
public interface DBPersistence {
     void saveToDB(ShoppingCart shoppingCart );
}
