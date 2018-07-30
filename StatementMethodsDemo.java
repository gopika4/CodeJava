import java.sql.*;;
public class StatementMethodsDemo {

    public static void main(String[] args) {
	try
	{
	Class.forName("oracle.jdbc.driver.OracleDriver"); //ojdo
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
	Statement stmt=con.createStatement();
	
	String sql="INSERT INTO EMPLOYEE VALUES('a',3000,'abc')";
	int rowsAffected =stmt.executeUpdate(sql);
	if(rowsAffected > 0)
	    System.out.println("Successfully inserted");
	else
	    System.out.println("Not inserted ");
	}
	catch(ClassNotFoundException ce){
	    System.out.println("Driver class not found");
	}
	catch(SQLException se)
	{
	    System.out.println("SQL exception");
	}
	
    }

}
