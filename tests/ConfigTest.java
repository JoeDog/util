package tests;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.joedog.util.config.Column;
import org.joedog.util.config.Columns;
import org.joedog.util.config.INI;

public class ConfigTest {
  public static void main(String [] args) {
    String sep = System.getProperty("file.separator");
    String cfg = System.getProperty("user.dir")+sep+"resources"+sep+"stock.conf";
    String hrs = System.getProperty("user.dir")+sep+"resources"+sep+"babe.conf";
    String tms = System.getProperty("user.dir")+sep+"resources"+sep+"teams.ini";

    int total = 0;
    List<Object> babe = Column.read(hrs);
    for (int i = 0; i < babe.size(); i++) {
      total += (int)babe.get(i); 
    }
    System.out.println("Column test");
    System.out.printf("Babe Ruth's career home runs: %d\n\n", total);

    List<Object[]> conf = Columns.read(cfg, "|");  
    System.out.println("Columns test");
    if (conf.size() >= 5) {
      for (int i = 0; i < 5; i++) {
        System.out.printf(
          "Line %d: %s | %.2f | %.2f | %.2f | %.2f | %.2f | %d \n", 
          i+1, 
          conf.get(i)[0], conf.get(i)[1], conf.get(i)[2], conf.get(i)[3],
          conf.get(i)[4], conf.get(i)[5], conf.get(i)[6]
        );
      }
      System.out.printf("\n");
    }
    
    Map<String, HashMap<String, Object>> ini = INI.read(tms, "=");
    System.out.println("INI test");
    System.out.println("Default:   ");
    System.out.println("  Username:   "+ini.get("default").get("username"));
    System.out.println("  Password:   "+ini.get("default").get("password"));
    System.out.println("Pirates:   ");
    System.out.println("  Pitcher:    "+ini.get("pirates").get("pitcher"));
    System.out.println("  Catcher:    "+ini.get("pirates").get("catcher"));
    System.out.println("  Left field: "+ini.get("pirates").get("left"));
    System.out.println("NY Jets: ");
    for (int i = 0; i < 3; i++) {
      System.out.println("  "+ini.get("nyjets").get(""+i));
    }
  }
}
