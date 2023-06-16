package tests;

import org.joedog.util.io.Logger;

public class LoggerTest {
  public static void main(String [] args) {
    System.setProperty("log.verbose", "false");
    Logger.log("/tmp/joedog.log", "Logger.log test");
    System.setProperty("log.verbose", "true");
    System.setProperty("log.file", "/tmp/joedog.log");
    Logger.log("Logger second test with verbosity");
  }
}
