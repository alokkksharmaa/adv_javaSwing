import java.nio.file.*;
// path = store a path
// paths = generate the file
// files = create the file

// WAP to create a file

class niofile {
  public static void main(String[] args) throws Exception {  
    Path folder = Paths.get("C:\\Users\\aloks\\Java\\Unit3\\tests");
    Files.createDirectories(folder);
    System.out.println("Directory created successfully");
    Path f = Paths.get("C:\\Users\\aloks\\Java\\Unit3\\lpu.txt");
    Files.createFile(f);
    System.out.println("File created");
  } 
}