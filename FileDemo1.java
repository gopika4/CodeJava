import java.io.File;
import java.io.IOException;

public class FileDemo1 {

    public static void main(String[] args) throws IOException {
	File f=new File("d://newfile");
	boolean created=f.createNewFile(); // or boolean status=f.mkdir();
	if(created==true)		   // or if(status)
	    System.out.println("Created");
	else
	    System.out.println("Cannot create");

    }

}
