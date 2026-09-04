import java.nio.file.*;
// path = store a path
// paths = generate the file
// files = create the file
// WAP to create a file

class niofile {
  public static void main(String[] args) throws Exception {  
    // Path folder = Paths.get("C:\\Users\\aloks\\Java\\Unit3\\tests");
    // // command to create a folder or directories.
    // Files.createDirectories(folder);
    // System.out.println("Directory created successfully");
    // Path f = Paths.get("C:\\Users\\aloks\\Java\\Unit3\\lpu.txt");
    // if(!Files.exists(f)){
    //   Files.createFile(f);
    //   System.out.println("hello");
    // }
    // // command to create a file 
    // System.out.println("File created");

    // // important path methods:
    // System.out.println(f.getFileName()); // lpu.txt

    // System.out.println(f.getParent()); // C:\Users\aloks\Java\Unit3

    // System.out.println(f.getRoot()); // C:\


    //  how create a relative path
    Path p1 = Paths.get("lpunew.txt");
    // Files.createFile(p1);
    System.out.println(p1);


    // how to convert  a relative path to a absolute path
    p1 = p1.toAbsolutePath();
    // System.out.println(p1);

    // System.out.println(p1.getFileName());

    // System.out.println(p1.getParent());

    // System.out.println(p1.getRoot());
    
    // wap to check wether it's a file or a directory
    // 2 methods (i)Files.isregularFile (ii)  Files.isDirectory
    // System.out.println(Files.isRegularFile(folder));
    // System.out.println(Files.isDirectory(f)); 
    
    // wap to create a directory in current pwd
    Paths.get("MynewFolder");
    // Files.createDirectories(p2);

    // create multiple directories
    Path p3 = Paths.get("MyNewFolder\\Cse\\Lpu");
    Files.createDirectories(p3);

    // how to delete a file
    Files.delete(p3);

    // wap to delete a file if exists
    Files.deleteIfExists(p3);


    // WAP to copy one fiel to another
    Path source = Paths.get("C:\\Users\\aloks\\Java Practicals\\unit3\\lpunew.txt");
    Path dest = Paths.get("lpunew.txt");
    Files.copy(source, dest);



  // if lpunew.txt already exist then what to do?
  Files.copy(source, dest);
  } 
}


// types of file
// (i)abs == pwd  ex :- "C:\\Users\\aloks\\Java\\Unit3\\tests"
// (ii)relative   ex :- paths.get("lpu.txt"); or paths.get("fs", lpu.txt);
