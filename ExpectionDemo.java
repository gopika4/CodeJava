
public class ExpectionDemo {

    public static void main(String[] args) {
	System.out.println(1);
	System.out.println(2);
	System.out.println(3);
	try
	{
	    System.out.println(5/0);
	}
	catch(ArithmeticException ae){
	    System.out.println("Division by 0 not possible");
	}
	System.out.println("End");
    }

}
