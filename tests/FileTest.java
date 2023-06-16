package tests;

import org.joedog.util.io.FileUtils;
import org.joedog.util.io.FileLineIterator;

public class FileTest {
  public static void main(String [] args) {
    String sep = System.getProperty("file.separator");
    String cfg = System.getProperty("user.dir")+sep+"resources"+sep+"stock.conf";
    String gzp = cfg+".gz";
    String zip = cfg+".zip";
    FileLineIterator fil = FileUtils.fileLineIterator(cfg);
    int count = 0;
    for (String line : fil) {
      count++;
    }
    System.out.printf("Read %d lines from %s\n", count, cfg);
    System.out.printf("Is %s text?        %s\n", cfg, FileUtils.isText(cfg));
    System.out.printf("Is %s gzipped?  %s\n", gzp, FileUtils.isGzipped(gzp));
    System.out.printf("Is %s gzipped? %s\n", zip, FileUtils.isGzipped(zip));
    System.out.printf("Is %s zipped?  %s\n", zip, FileUtils.isZipped(zip));
  }
}
