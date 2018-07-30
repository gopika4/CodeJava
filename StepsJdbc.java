import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class StepsJdbc {

    public static void main(String[] args) throws IOException{
	try
	{
	Class.forName("oracle.jdbc.driver.OracleDriver"); //ojdo
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	System.out.println("Enter name");
	String name=br.readLine();
	System.out.println("Enter date");
	String date=br.readLine();
	System.out.println("Enter STEPS	");
	int step=Integer.parseInt(br.readLine());
	String sql="insert into DAILYSTEPS values(?,?,?)";
	PreparedStatement p=con.prepareStatement(sql);
	p.setString(1, name);
	p.setString(2, date);
	p.setInt(3, step);
	
	int i=p.executeUpdate();
	System.out.println("Successfully inserted");
	String sq="update TOTALSTEPS set steps=steps+" + step + "WHERE NAME=?";
	PreparedStatement p1=con.prepareStatement(sq);
	p1.setString(1, name);
	int j=p1.executeUpdate();
	
	if(i>0&&j>0)
	{
	    con.commit();
	    System.out.println("COMMITED");
	}
	else
	{
	    con.rollback();
	System.out.println("ROLLBACK");
	}
	}
	catch(SQLException se)
	{
	    System.out.println("sql error: "+se.getMessage() );
	}
	catch(ClassNotFoundException ce)
	{
	    System.out.println("class not found");
	}

    }

}
