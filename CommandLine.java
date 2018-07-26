import java.util.ArrayList;

public class CommandLine {

    public static void main(String[] args) {

	ArrayList a1=new ArrayList();
	a1.add("apple");
	a1.add("banana");
	a1.add("mango");
	a1.add(21);
	a1.add(22);
	
	int a=a1.indexOf("apple");
	a1.remove(a);
	a1.add(a, "Grapes");
	System.out.println(a1);
    }

}
