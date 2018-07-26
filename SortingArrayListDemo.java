import java.util.ArrayList;
import java.util.Collections;
class Cars implements Comparable 
{
    String color;
    String brand;
    double price;
    public Cars(String color, String brand, double price) {
	super();
	this.color = color;
	this.brand = brand;
	this.price = price;
    }
    @Override
    public String toString() {
     return this.color+" "+this.brand+" "+this.price;
    }
    public int compareTo(Object o)
    {
	int r = 0;
	Cars cc=(Cars)o;
	if(this.price == cc.price)
	    r= 0;
	else if(this.price<cc.price)
	    r=-1;
	else if(this.price>cc.price)
	    r= 1;
	return r;
	}
    
}

public class SortingArrayListDemo {

    public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	Cars c1=new Cars("Silver","Audi",6);
	Cars c2=new Cars("Red","BMW",499);
	Cars c3=new Cars("Black","Bugati",70);
	Cars c4=new Cars("Green","Ford",67);
	Cars c5=new Cars("White","Maruthi",675674.89);
	
	a1.add(c1);
	a1.add(c2);
	a1.add(c3);
	a1.add(c4);
	a1.add(c5);

	System.out.println(a1);
	Collections.sort(a1);
	System.out.println(a1);
	
    }

}
