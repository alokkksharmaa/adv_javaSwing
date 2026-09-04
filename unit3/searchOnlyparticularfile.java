import java.util.stream.*;
import java.nio.file.*;

// filter only the .txt files

public class searchOnlyparticularfile {
  public static void main(String[] args) throws Exception {
    Path p = Paths.get("MyNewFolder");
    try(Stream<Path> s = Files.list(p)){
      s.filter(x->x.toString().endsWith(".txt")).forEach(System.out::println);
    }
  }  
}