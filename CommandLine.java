
//@GopikaV
//18th July 2018
public class CommandLine {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int sum=0;
	
	for(int i=0;i<args.length;i++)
	    sum=sum + Integer.parseInt(args[i]);
	System.out.println(sum);
	
    }

}
