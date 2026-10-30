
import java.util.*;
import java.time.*;

public class checkWorkingDays {
  public static void main(String[] args) {
   
    LocalDate start =  LocalDate.of(2026, 12,01);
    LocalDate end = LocalDate.Of(2026,12,10);
    int ctr = 0;
    while(start.isBefore(end)){
      DayOfWeek day = start.getDayOfWeek();
      if(day != DayOfWeek.SATURDAY || day != DayOfWeek.SUNDAY){
        ctr++;
      }
      start = start.plusDays(1);
    }
    System.out.println("Working days:" + ctr);
  }
}
