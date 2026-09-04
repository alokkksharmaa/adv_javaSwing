import java.nio.file.*;
// I want to read this file using stream
// write a program to read one file line by line using stream
import java.util.stream.*;

public class writefile {
  public static void main(String[] arg) throws Exception{
    try{
    Path p = Paths.get("lpunew.txt");
    Stream<String> s = Files.lines(p);
    s.forEach(System.out::println);
    // m2
    // s.forEach(x->System.out.println(x));
    // s.close();
  }catch(Exception e){
    System.out.println(e);
  }
  }
}