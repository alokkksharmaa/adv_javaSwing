import java.util.*;
import java.time.*;


public class checkNextSunday {
  public static void main(String[] args) {
    System.out.println("Enter date (YYYY-MM-DD): ");
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    LocalDate d = LocalDate.parse(input);
    for (int i = 1; i <= 7; i++) {
      LocalDate nextDate = d.plusDays(i);
      if (nextDate.getDayOfWeek() == DayOfWeek.SUNDAY) {
        System.out.println("Next Sunday date is: " + nextDate);
        break;
      }
    }
    sc.close();
  }
}
