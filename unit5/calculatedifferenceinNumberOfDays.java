import java.util.*;
import java.time.LocalDate;
import java.time.format.*;
import java.time.temporal.*;
import java.util.Scanner;

// chornounit.days.between(d1,d2);
// choronounit.MONTHS.between(d1, d2);
// chornonunit.YEARS.between(d1,d2);


public class calculatedifferenceinNumberOfDays {
  public static void main(String[] args) {
   LocalDate d1 = LocalDate.of(2025,05,11);
   LocalDate d2 = LocalDate.of(2026,07,21);

   long days =  ChronoUnit.DAYS.between(d1, d2);
   long months = ChronoUnit.MONTHS.between(d1, d2);
   long years = ChronoUnit.YEARS.between(d1, d2);
  

   System.out.println("No of days gap: " +  days);
   System.out.println("No of months gap: "+ months);
   System.out.println("No of years gap: " + years);

  }
}
