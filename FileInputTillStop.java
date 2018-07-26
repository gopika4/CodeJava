import java.io.*;

public class FileInputTillStop {
    public static void main(String args[]) throws IOException{
	FileOutputStream fos=new FileOutputStream("d:\\sample1.txt");
	DataOutputStream dos=new DataOutputStream(fos);
		
	InputStreamReader ist=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(ist);
	System.out.println("Enter ");
	
	String str=br.readLine();
	while(!str.equalsIgnoreCase("stop"))
	{
	dos.writeBytes(str);
        System.out.println("Enter ");
	
	 str=br.readLine();

	}
	dos.close();
	System.out.println("success");

}

    }


