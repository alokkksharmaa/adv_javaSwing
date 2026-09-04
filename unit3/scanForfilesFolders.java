import java.util.stream.*;
import java.nio.file.*;


// check what are the files and folders present inside files and folder
public class scanForfilesFolders {

  public static void main(String[] args) throws Exception {
    Path p = Paths.get("MynewFolder");
    // Stream<Path> s = files.
    try(Stream<Path> s = Files.walk(p)){
      s.forEach(System.out::println);
      s.close();
    }
    // Files.list(p);   //returns path type stream
    // System.out.println(p);
  }
}
