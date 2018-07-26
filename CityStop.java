import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CityStop {

    public static void main(String[] args) throws IOException 
    {
	int c = 0;
	InputStreamReader i = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(i);
	String str;
	do 
	{
	    System.out.println("Enter cities");
	    str = br.readLine();
	    c++;
	}while (!str.equalsIgnoreCase("stop"));
	System.out.println("There are " + (c-1) + " cities");

    }

}
