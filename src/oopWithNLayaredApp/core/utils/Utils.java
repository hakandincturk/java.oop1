package oopWithNLayaredApp.core.utils;

import oopWithNLayaredApp.core.logging.Logger;

public class Utils {
  public static void runLoggers(Logger[] loggers, String message) {
    for (Logger logger : loggers) {
      logger.log(message);
    }
  }
}
