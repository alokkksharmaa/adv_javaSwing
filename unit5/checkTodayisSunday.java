import java.util.*;
import java.time.*;

// WAP to check today is sunday or not

public class checkTodayisSunday {
  public static void main(String[] args) {
    LocalDate d = LocalDate.now();
    DayOfWeek  day = d.getDayOfWeek();

    if(day == DayOfWeek.SUNDAY){
      System.out.println("Today is Sunday");
    }
    else{
      System.out.println("Today is not sunday");
    }
  }

}
