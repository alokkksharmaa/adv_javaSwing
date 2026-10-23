import java.time.*;
import java.time.format.*;
import java.util.*;

// what is command line argument
//  wap to accept the date from the user in dd-MM-yyyy format and print it in dd-MMM-yyyy format


public class dateTime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    LocalDate d = LocalDate.parse(s, f1);
    DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
    System.out.println(d.format(f2));
  }
}
