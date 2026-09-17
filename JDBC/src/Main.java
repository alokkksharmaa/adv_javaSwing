import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/world";
        String username = "root";
        String password = "root";

        try {
            Connection connection =
                    DriverManager.getConnection(url, username, password);

            System.out.println("Connected to MySQL successfully!");
            System.out.println(username);
            System.out.println(password);

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}