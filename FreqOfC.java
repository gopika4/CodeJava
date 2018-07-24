
public class FreqOfC {

    public static void main(String[] args) {
	int ctr=0;
	String s=args[0];
	for(int i=0;i<s.length();i++)
	{
	    
	    if(s.charAt(i)=='C')
		ctr++;
	    
		
	}
	System.out.println(ctr);

    }

}
