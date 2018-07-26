import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AvgFive {

    public static void main(String[] args) throws  IOException {
	int sum=0;
	InputStreamReader ist=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(ist);
	System.out.println("Enter 5 number");
	for(int i=0;i<=4;i++)
	{
	    int num=Integer.parseInt(br.readLine());
	    sum=sum+num;
	}
	int avg=sum/5;
	System.out.println("Average "+avg);
	
	

    }

}
