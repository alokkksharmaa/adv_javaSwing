import java.util.stream.*;
import java.nio.file.*;



public class startswithA {
  public static void main(String[] args) throws Exception {
    Path p = Paths.get("lpunew.txt");
    try(Stream<String> s = Files.lines(p)){
      s.filter(x->x.startsWith("A")).forEach(System.out::println);
    }
  }
}
