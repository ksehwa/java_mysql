import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MiniProjectConnectMysql {
    /**
     * @param args
     */
    public static void main(String[] args) {
  
// My sql workbench 접속
// vs code에서 폴더 만들기, class파일 만들기
// My sql 열기 - my sql - connector J
// Database 에서 connect to Database 
//connection Method:  standard(TCP/IP) 
// Host name : locall host
// Default Schma : 원하는 데이터베이스 이름 입력
final String USER = "root";
final String PASS = "tbrs00002b";
final String DB_URL = "jdbc:mysql://localhost/world";
final String QUERY = " select ID,Name,Population "+
"from city " +
"where 1=1 " +
"and population >= 9230000 " ;

try{
    Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
    Statement stmt = conn.createStatement();
// 새로운 query 생성, select * from (원하는 테이블명)으로 테이블 출력
    ResultSet rs = stmt.executeQuery(QUERY);
// result grid, action output 확인   
    while (rs.next()) {
        // Retrieve by column name
        System.out.print("ID: " + rs.getInt("ID"));
        System.out.print(", Name: " + rs.getString("Name"));
        System.out.println(", Population: " + rs.getInt("Population"));
    } 
}catch (SQLException e) {
         e.printStackTrace();
    }
       

    return ;    
    
}
}

// select * from (원하는 테이블명)으로 테이블 출력5
// 출력확인


    
