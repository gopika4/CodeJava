import java.io.*;
public class ReadMyName {

    public static void main(String[] args) throws IOException 
    {
	InputStreamReader ist=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(ist);
	System.out.println("Enter your Name");
	String myName=br.readLine();
	System.out.println("Enter yor age");
	int age=Integer.parseInt(br.readLine());
	System.out.println("Welcome  "+ myName+age); 
	
    }

}
