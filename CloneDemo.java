class Places implements Cloneable
{
    String name;
    String country;
    long population;
    public Places(String name,String country,long population)
    {
	super();
	this.name=name;
	this.country=country;
	this.population=population;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
}
public class CloneDemo {

    public static void main(String[] args) {
	Places p1=new Places("New York","USA",200000000);
	System.out.println(p1);
	Places p2=null;
	try
	{
	    p2=(Places)p1.clone();
	}
	catch(CloneNotSupportedException e)
	{
	    System.out.println("Cloning is available");
	    e.printStackTrace();
	}
	p1.country="India";
	System.out.println(p1.country);
	System.out.println(p2.country);
    }

}
