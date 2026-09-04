import java.util.stream.*;
import java.nio.file.*;
// print the file names only present inside abc folder

public class printfilesnamesonly {
  public static void main(String[] args) throws Exception {

  Path p = Paths.get("MynewFolder");
  try(Stream<Path> s = Files.list(p)){
    s.filter(x->Files.isRegularFile(x)).map(x->x.getFileName().toString()).forEach(System.out::println);
  }
  } 
}
