import java.util.*;
import java.time.*;

public class acceptyearcalculateDOB {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    LocalDate dob = LocalDate.parse(s);
    LocalDate d = LocalDate.now();

    Period p = Period.between(dob, d);
    System.out.println("Age: "+ p.getYears()+ "Years: " + p.getMonths() + "months: " + p.getDays() + "Days.");
    
  }
}