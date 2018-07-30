import java.sql.*;
public class BatchDemo {
    public static void main(String args[]) {
	try {
	    Class.forName("oracle.jdbc.driver.OracleDriver"); // ojdo
	    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

	    String sql = "{?=call BIG1(?,?)}";
	    CallableStatement csmt = con.prepareCall(sql);
	    csmt.registerOutParameter(1, Types.INTEGER);
	    csmt.setInt(2, 23);
	    csmt.setInt(3, 123);
	    boolean ex = csmt.execute();
	    System.out.println("Biggest number " + csmt.getInt(1));
	    csmt.close();
	    con.close();
	} catch (ClassNotFoundException ce) {
	    System.out.println("Driver class not found");
	} catch (SQLException se) {
	    System.out.println("SQL exception");
	    System.out.println(se.getMessage());
	}

    }

}
