import java.sql.*;


public class JDBCConnectDemo {

    public static void main(String[] args) throws Exception {
	try
	{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	}
	catch(ClassNotFoundException e1)
	{
	    System.out.println("Unable to locate the driver");
	}
	String jdbcURL="jdbc:oracle:thin:@localhost:1521:orcl";
	String username="scott";
	String password="tiger";
	Connection con=null;
	try
	{
	con=DriverManager.getConnection(jdbcURL,username,password);
	System.out.println("Connection successful");
	}
	catch(SQLException e)
	{
	    System.out.println("Could not connect to the server");
	    System.out.println(e.getMessage());
	}
	java.sql.Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery("SELECT * FROM EMPLOYEE");
	while(rs.next())
	{
	    String name=rs.getString(1);
	    int sal=rs.getInt(2);
	    String dep=rs.getString(3);
	    System.out.println(name+ "  "+sal+"  "+dep);
	}
	
	rs.close();
	stmt.close();
	con.close();
    }

}
