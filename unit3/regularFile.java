import java.util.stream.*;
import java.nio.file.*;


public class regularFile {

  public static void main(String[] args) throws Exception {
    Path p = Paths.get("MynewFolder");
    try(Stream<Path> s = Files.list(p)){
      s.filter(x->Files.isRegularFile(x)).forEach(System.out::println);
      // if we want to search only the directory
      // s.filter(x->Files.isDirectory(x)).forEach(System.out::println);
    }

  }
  
}
