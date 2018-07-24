
public class PasswordValidator {

    public static void main(String[] args) {
	int w = 0, d = 0, l = 0, sp = 0, up = 0;

	String passwo = "Hell0W orl";

	char c[] = passwo.toCharArray();

	if (c.length > 10 || c.length < 5) {

	    System.out.println("Password should be max of 10 and min of 5 characters");

	} else {
	    for (int i = 0; i < c.length; i++) {
		if (Character.isDigit(c[i]))
		    d++;
		else if (Character.isWhitespace(c[i]))
		    w++;
		
		else if (Character.isUpperCase(c[i]))
		    up++;
		else if (Character.isLetter(c[i]))
		    l++;
		else
		    sp++;
	    }

	}
	

	if ((d != 0) && (up != 0) && (sp != 0) && (w==0)) {
	    System.out.println("Password is valid");

	} else
	    System.out.println("Password not valid");
    }

}
