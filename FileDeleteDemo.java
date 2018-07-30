import java.io.File;
import java.io.IOException;

public class FileDeleteDemo {

    public static void main(String[] args) throws IOException{
	File f=new  File("d://Newfilecreated");
	if(f.exists())
	{
	    System.out.println("File exists");
	    boolean status=f.delete();
	    if(status)
	    {
		System.out.println("Created");
	    }
	    else
		System.out.println("Not created");
	    
	}
	else
	{
	    System.out.println("File doesnt exist");
	    boolean stst =f.createNewFile();
	    if(stst)
		System.out.println("Created");
	    else
		System.out.println("failure");

	}
		
    }

}
