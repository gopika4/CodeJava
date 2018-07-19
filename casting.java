//@GopikaV
//18th July 2018
class Emp
{
    
}
class Hr extends Emp
{
  
}
class Tech extends Emp
{

}
class Recu extends Hr
{
    
    
}
class Finan extends Hr
{
    
}
class Javapm extends Tech
{
    
}
class MainFrame extends Tech
{
    
}
public class casting {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Tech t =new Javapm();
	Javapm jp=(Javapm)t;
	
	if (t instanceof Javapm) {
	   System.out.println("Yes");
	    
	}
	
	
	
    }

}
