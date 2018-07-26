import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadFind {
	public static void main(String[] args) throws IOException {
		FileReader f=new FileReader("hello.txt");
		BufferedReader br = new BufferedReader(f);
		
		String line = br.readLine();
		int flag=0;
		while(line!=null)
		{
			if(line.contains("java"))
			{
				flag=1;
				break;
			}
			line = br.readLine();
		}
		if(flag==1)
		{
			System.out.println("Success");
		}
		else
		{
			System.out.println("Failure");
		}
		f.close();
	}
}
