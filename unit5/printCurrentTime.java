import java.util.*;
import java.time.*;
import java.time.format.*;

public class printCurrentTime {

  public static void main(String[] args) {
    LocalTime t = LocalTime.now();
    // System.out.println(t);
    // change the format

    DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm a"); //build the pattern and print it
    System.out.println(t.format(f));
  }
}
