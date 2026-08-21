import java.util.*;
import java.util.stream.*;

class partition {

  public static void main(String[] args){
  // write a programme  to partition the element by even and and odd
  List<Integer> li = Arrays.asList(10,11, 12,17, 123, 134, 454,43,94);
  Map<Boolean, List<Integer>> map =  li.stream().
                                            collect(Collectors
                                                .partitioningBy(n->n%2==0));
  Map<String, List<Integer>> map1 =  li.stream().
                                            collect(Collectors
                                                .groupingBy(n->n%2==0? "Even" : "Odd"));                                             
  System.out.println(map);
  System.out.println(map1);
  }
}
