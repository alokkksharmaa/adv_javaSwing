import java.sql.*;
import java.util.*;

// JDBC connection


public class jdbc {
  public static void main(String[] args) {
    try
    {
      String url = "jdbc:mysql://localhost:3306/lpudatabase";
      String username = "root";
      String password = "paswword";

      // load the driver 
      Class.forName("com.mysql.cj.jdbc.Driver");
      // establish the connection
      Connection con = DriverManager.getConnection(url, user, password);
      System.out.println("connection extablished successfull!!");
    }catch(Excepetion e ){

    }
  }
}
