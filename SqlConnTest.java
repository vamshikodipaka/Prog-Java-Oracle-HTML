import java.sql.*;
class SqlConnTest
{
public static void main(String[]args)throws Exception
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:server","system","system");
if(con!=null)
System.out.println("Connection  is established:  ");
}
}