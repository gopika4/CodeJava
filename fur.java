//@GopikaV
//16th July 2018
class Cot
{
    double price;
}
class Chair
{
    double price;
    
}
class Table
{
    double price;
    
}
public class fur {
    public double caldis;
    public double discal(Cot c)
    {
	return(c.price*0.3);
    }
    public double discal(Chair cc)
    {
	return(cc.price*0.4);
    }
    public double discal(Table t)
    {
	return(t.price*0.5);
    }

public static void main(String arg[])
{
    Cot c=new Cot();
    Chair cc=new Chair();
    Table t=new Table();
    c.price=2000;
    cc.price=5000;
    t.price=8000;
    fur f=new fur();
    double disc=f.discal(c);
    System.out.println(disc);

    double discc=f.discal(cc);
    System.out.println(discc);

    double dist=f.discal(t);
    System.out.println(dist);
}
}

