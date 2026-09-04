import java.nio.file.*;
// import java.util.stream.*;
import java.util.*;

public class writeSomethingintoFile {

  public static void main(String[] args) throws Exception {

    List<String> li = Arrays.asList("Rahul", "Amit", "Manas",  "Unorddered_map");
    Path p = Paths.get("writefile.txt");
    Files.write(p, li); 
  }
}
