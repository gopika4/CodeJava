import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class DynamicSqlStatemnt {

    public static void main(String[] args) {
	try
	{
	Class.forName("oracle.jdbc.driver.OracleDriver"); //ojdo
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	System.out.println("Enter EMPLOYEE NAME");
	String ename=br.readLine();
	System.out.println("You entered "+ename);
	String sql="delete from EMP where TRIM(ename)=?";
	PreparedStatement psmt=con.prepareStatement(sql);
	psmt.setString(1, ename);
	
	int rowsAffected =psmt.executeUpdate();
	System.out.println("rowsAffected "+rowsAffected);
	if(rowsAffected>0)
	    System.out.println("Successfully deleted");
	else
	    System.out.println("Error ");
	
	psmt.close();
	con.close();
	}
	catch(ClassNotFoundException ce){
	    System.out.println("Driver class not found");
	}
	catch(SQLException se)
	{
	    System.out.println("SQL exception");
	    System.out.println(se.getMessage());
	}
	catch(IOException ioe)
	{
	    System.out.println("IOException");
	}
    }

}


