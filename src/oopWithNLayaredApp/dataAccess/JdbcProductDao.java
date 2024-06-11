package oopWithNLayaredApp.dataAccess;

import oopWithNLayaredApp.entities.Product;

public class JdbcProductDao implements ProductDao { // Dao --> Data Access Object
  public void add(Product product) {
    System.out.println("Product added by JDBC");
  }
  
}
