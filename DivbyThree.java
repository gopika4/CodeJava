import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivbyThree {

    public static void main(String[] args) throws IOException {
	InputStreamReader ist=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(ist);
	System.out.println("Enter number");
	int num=Integer.parseInt(br.readLine());
	if(num%3==0)
	    System.out.println("Divisible by 3");
	else
	    System.out.println("Not divisible by 3");
	
	
    }

}
