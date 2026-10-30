import java.util.*;
import java.time.*;

// India : Asia/Kolkata
// UnitedKingdom: Europe/London
// Eastern UnitedStates: America/New_York  
// Japan : Asia/Tokyo

// WAP to print current time of india and London


public class timeofAnotherCountry {
    public static void main(String[] args) {
     ZonedDateTime India = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
     ZonedDateTime London = ZonedDateTime.now(ZoneId.of("Europe/London"));

     System.out.println("Indian time  is:" +  India);
     System.out.println("London time  is:" +  London);

     LocalTime t = LocalTime.now(ZoneId.of("Europe/London"));
     System.out.println(t);
     
    }
}
