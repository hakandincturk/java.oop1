package oopWithNLayaredApp.business;

import oopWithNLayaredApp.core.logging.Logger;
import oopWithNLayaredApp.dataAccess.ProductDao;
import oopWithNLayaredApp.entities.Product;

public class ProductManager {
  private  ProductDao productDao;
  private Logger[] loggers;
  
  public ProductManager(ProductDao productDao, Logger[] loggers) {
    this.productDao = productDao;
    this.loggers = loggers;
  }

  public void add (Product product) throws Exception {
    if(product.getUnitPrice() < 10) {
      throw new Exception("Price can not be less than 10");
    }

    productDao.add(product);

    for (Logger logger : loggers) { // [db, mail]
      logger.log(product.getName() + " urun eklendi.");
    }
  }
}
