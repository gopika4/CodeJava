import java.io.*;
public class FileList {

    public static void main(String[] args) throws IOException{
	File f=new File("d://java");
	if(f.canRead())
	    System.out.println("This file is readable");
	if(f.canWrite())
	    System.out.println("File is writable");
	

    }

}
