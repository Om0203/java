import java.sql.*;

public class Exp4_JDBC {
public static void main(String[] args) {
//Create database : "jdbcdb"
//Create table in this database
/*	CREATE TABLE studentdata ( SrNo INT(5),
RollNo INT(6), first_name VARCHAR(255), last_name VARCHAR(255), email_id VARCHAR(255), mobile BIGINT(10)
);	*/
String url = "jdbc:mysql://localhost:3306/jdbcdb"; String usr = "root";
String psw = "";
String query1 = "insert into studentdata values(1, 304, 'Karan', 'Kumar', 'abc@gmail.com', 1239874560)";
String query2 = "select * from studentdata";
try {
 


usr, psw);
 
Class.forName("com.mysql.jdbc.Driver"); Connection con = DriverManager.getConnection(url,

Statement stmt = con.createStatement();

System.out.println("Inserting data..."); stmt.execute(query1);

System.out.println("Data after insertion..."); ResultSet rs = stmt.executeQuery(query2);
 

System.out.println("Sr.No. " + "Roll No. " + "First Name	" + "Last Name " + "	Email ID " + "	Mobile No.");

while(rs.next()){
System.out.println(" " + rs.getInt("SrNo") + "	" + rs.getInt("RollNo") + "		" + rs.getString("first_name") + "	" + rs.getString("last_name")
+ "	" + rs.getString("email_id") + "	" + rs.getString("mobile"));
}
} catch (SQLException e) { e.printStackTrace();
} catch (ClassNotFoundException e) { e.printStackTrace();
}
}
}
