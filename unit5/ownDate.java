import java.util.*;
import java.time.*;

// WAP to find difference b/w two dates
// period class is used to find the difference b/w two dates

public class ownDate {
  public static void main(String[] args) {
   LocalDate d1 = LocalDate.of(2022,05,21);
   LocalDate d2 = LocalDate.of(2026,11,23);

   Period p  = Period.between(d1, d2);
   System.out.println("Years:" +  p.getYears() + " Months:" +  p.getMonths() + " Days:" + p.getMonths());

  }
}
