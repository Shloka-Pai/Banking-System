//represents active connection between java and database
import java.sql.Connection;
//DriverManager
//      ↓
//Find MySQL JDBC Driver
 //     ↓
//Connect to MySQL
//     ↓
//Return Connection object
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
