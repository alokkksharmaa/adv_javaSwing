import java.util.*;
import java.time.*;
import time.format.*;

public class checkIfdateisBeforethedateorafter {

  public static void main(String[] args) {
  String sc = new Scanner(System.in);
  String s = sc.nextLine();
  LocalDate d = LocalDate.parse(s);
  LocalDate today = LocalDate.now();
  if(d.isBefore(today)){
    System.out.println("the date id befor the current date");
  }
  if(d.isAfter(today)){
    System.out.println("The date is afte rthe current date");
    }
  }
}