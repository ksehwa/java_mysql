import java.sql.*;

public class ConnectMysql {
   static final String DB_URL = "jdbc:mysql://localhost/world";
   static final String USER = "root";
   static final String PASS = "tbrs00002b";
   static final String QUERY = "SELECT id, first, last, age FROM Employees";

   public static void main(String[] args) {
      // Open a connection
      try {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(QUERY);
         // Extract data from result set
         while (rs.next()) {
            // Retrieve by column name
            System.out.print("ID: " + rs.getInt("id"));
            System.out.print(", Age: " + rs.getInt("age"));
            System.out.print(", First: " + rs.getString("first"));
            System.out.println(", Last: " + rs.getString("last"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}