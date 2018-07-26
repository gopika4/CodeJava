import java.io.*;
public class FileDemo {
    public static void main(String args[]) throws IOException
    {
	FileInputStream fis=new FileInputStream("hello.txt");
	int xx=fis.read();
	while(xx!=-1)
	{
	    System.out.print((char)xx);
	    xx=fis.read();
	}
	fis.close();
    }
}
