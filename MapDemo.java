
import java.util.*;

public class MapDemo 
{

    public static void main(String[] args) 
    {
	HashMap hs = new HashMap();
	hs.put(100, "Guru");
	hs.put(110, "Aju");
	hs.put(120, "Raju");
	System.out.println(hs);
	System.out.println(hs.get("2"));
	// if key value is not known
	Set keys = hs.keySet();
	Iterator it = keys.iterator();
	while (it.hasNext())
	{
	    int	 key = (int) it.next();// key individually
	    System.out.println(hs.get(key));// read the value by giving the key
	}
    }

}
