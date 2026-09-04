import java.util.stream.*;
import java.nio.file.*;

public class paragraphreading {
  
  public static void main(String[] args) throws Exception {
    Path p = Paths.get("lpunew.txt");

    try(Stream<String> s = Files.lines(p)){
      s.filter(x->x.contains("java")).forEach(System.out::println);
    }
  }
}
