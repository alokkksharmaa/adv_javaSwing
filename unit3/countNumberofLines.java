import java.util.stream.*;
import java.nio.file.*;

public class countNumberofLines {
  
  public static void main(String[] args) throws Exception {
    Path p = Paths.get("lpunew.txt");
    try(Stream<String> s = Files.lines(p)){
      // s.forEach(System.out::println);
      long lines = s.count();
      System.out.println(lines);
    }
  }
}
