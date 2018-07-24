
public class WrapperDemo {

    public static void main(String[] args) {
	String sen="Delottie works for 9 hours *";
	 char s[]=sen.toCharArray();
	for(int i=0;i<sen.length();i++)
	{
	   if(Character.isDigit(s[i]))
	    System.out.println(s[i]+" is a digit");
	   else if(Character.isWhitespace(s[i]))
		    System.out.println(s[i]+" is a blank");
	   else if(Character.isLetter(s[i]))
		    System.out.println(s[i]+" is a letter");
	   else 
	       System.out.println(s[i]+" is a special character");
	    
	}
    }

}
