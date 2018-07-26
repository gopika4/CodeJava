import java.util.*;
public class ArrayListDemo {

    public static void main(String[] args) {
	LinkedList ll=new LinkedList();
	ll.add("Java");
	ll.add("C++");
	ll.add("php");
	ll.add("Python");
	ll.add("C#");
	System.out.println(ll);
	for(int i=0;i<ll.size();i++)
	{
	    System.out.println("Reading by for "+ll.get(i));
	}
	Iterator it=ll.iterator();
	while(it.hasNext())
	{
	    System.out.println(it.next());
	}
	ListIterator lt=ll.listIterator();
	while(lt.hasNext())
	{
	    System.out.println(lt.next());
	}
	while(lt.hasPrevious())
	{
	    System.out.println(lt.previous());
	}
    }

}
