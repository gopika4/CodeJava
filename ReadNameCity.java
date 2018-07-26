import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadNameCity {

    public static void main(String[] args)throws IOException {
	InputStreamReader ist=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(ist);
	System.out.println("Enter your Name");
	String myName=br.readLine();
	System.out.println("Enter your city");
	String city=br.readLine();
	System.out.println("Welcome  "+ myName+"\nYou are living in "+city); 

    }

}
