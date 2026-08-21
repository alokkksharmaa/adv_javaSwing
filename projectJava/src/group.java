import java.util.*;
import java.util.stream.*;

class group{

  String name;
  String dept;
  // when functional parameter and class parameter is same then we use, this keyword
  group(String name, String dept){
    this.name = name;
    this.dept = dept;
  }
  // equals and toString method  ======= ////
  public String toString(){
    return name;
  }
    public static void main(String[]  args){

      ArrayList<group> li = new ArrayList<>();
      li.add(new group("Ashok", "CSE"));
      li.add(new group("Alok", "ECE"));
      li.add(new group("Sita", "MECH"));
      li.add(new group("Ramesh", "ECE"));

      // System.out.println(li);

      Map<String, List<group>> result = li.stream()
                                            .collect(Collectors
                                              .groupingBy(n->n.dept));
      System.out.println(result);
      
    }
  }


