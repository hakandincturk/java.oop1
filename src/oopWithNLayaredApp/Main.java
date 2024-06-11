package oopWithNLayaredApp;

import oopWithNLayaredApp.business.ProductManager;
import oopWithNLayaredApp.core.logging.DatabaseLogger;
import oopWithNLayaredApp.core.logging.FileLogger;
import oopWithNLayaredApp.core.logging.Logger;
import oopWithNLayaredApp.dataAccess.HibernateProductDao;
import oopWithNLayaredApp.entities.Product;

public class Main {
  public static void main(String[] args) throws Exception {
    Product product1 = new Product(1, "iPhone XR", 10000);

    Logger[] loggers = {
      new DatabaseLogger(),
      new FileLogger()
    };

    ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
    productManager.add(product1);
  }
}