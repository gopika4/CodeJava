import java.io.*;
public class FileWriterDemo {

    public static void main(String[] args) throws IOException {
	FileWriter fv= new FileWriter("d:/delottie/sample.txt");
	BufferedWriter bw=new BufferedWriter(fv);
	bw.write("First Line");
	bw.newLine();
	bw.write("Second Line");
	bw.newLine();
	bw.write("Third Line");
	bw.newLine();
	bw.write("Fourth Line");
	bw.newLine();
	bw.close();
	fv.close();
	
	System.out.println("Successsfully created");
	
	
    }

}
