import java.util.HashSet;
class MobilePhone
{
    String mobilename;
    int price;
    public MobilePhone(String mobilename,int price)
    {
	super();
	this.mobilename=mobilename;
	this.price=price;
    }
    public String toString()
    {
	return this.mobilename+" "+this.price ;
    }
    public boolean equals(Object obj)
    {
	MobilePhone mm=(MobilePhone)obj;
	if(this.mobilename.equals(mm.mobilename)&& this.price==mm.price)
	    return true;
	else
	    return false;
    }
    public int hashCode()
    {
	return this.price*5;
    }
}

public class SetuserDefinedDemo 
{

    public static void main(String[] args) 
    {
	MobilePhone mp1=new MobilePhone("Samsung",123);
	MobilePhone mp2=new MobilePhone("Samsung",123);
	MobilePhone mp3=new MobilePhone("Samsung",1234);
	HashSet hs=new HashSet();
	hs.add(mp1);
	hs.add(mp2);
	hs.add(mp3);
	System.out.println(hs);
    }

}
