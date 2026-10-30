
import java.util.*;
import java.time.*;

public class printcurrentMonthandCurrentYear {
  public static void main(String[] args) {
   LocalDate d  = LocalDate.of(2026,10,30);
   System.out.println(d.getDayOfWeek());
   System.out.println(d.getDayOfMonth());
   System.out.println(d.getDayOfYear());
   System.out.println(d.getYear());
  }
}
