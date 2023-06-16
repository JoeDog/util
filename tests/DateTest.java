package tests;

import org.joedog.util.DateUtils;

public class DateTest {
  public static void main(String [] args) {
    String day = "10/19/1987";
    String yad = "10.19.1987";
    System.out.printf("Now:                 %s\n", DateUtils.now());
    System.out.printf("Now(format):         %s\n", DateUtils.now("dd/MM/yy HH:mm"));
    System.out.printf("Month:               %s\n", DateUtils.monthToString(DateUtils.month(),true));
    System.out.printf("Day:                 %s\n", DateUtils.dayOfWeek(true));
    System.out.printf("Day(iso):            %s\n", DateUtils.weekDay(true));
    System.out.printf("Is %s valid: %s\n", day, DateUtils.isValid(day));
    System.out.printf("Convert to Date:     %s\n",  DateUtils.fromString(day));
    System.out.printf("Is %s valid: %s\n", yad, DateUtils.isValid(yad));
    System.out.printf("Convert to Date:     %s\n",  DateUtils.fromString(yad));
  }
}
