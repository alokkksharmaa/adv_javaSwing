
// Write a programme to accept the date and check which day it falls.
import java.util.*;
import java.time.*;

public class acceptDateandValidate {
  public static void main(String[] args) {
    System.out.println("Write date in YYYY-MM-DD form: ");
   Scanner sc = new Scanner(System.in);
   String s = sc.nextLine();

   try {
    LocalDate d = LocalDate.parse(s);
    // dayofweek is a class and get day of week is a method
    DayOfWeek day = d.getDayOfWeek();

    System.out.println("Date is: " + d);
    System.out.println("Day is: " + day);
   } catch (Exception e) {
    System.out.println("Invalid date format. Use YYYY-MM-DD.");
   }

   sc.close();

   
  }
}
