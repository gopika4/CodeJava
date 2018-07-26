import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ShuffleDemo implements Comparator{

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	ArrayList a1=new ArrayList();
	
	a1.add(1);
	a1.add(2);
	a1.add(3);
	ArrayList a2=new ArrayList();
	a2.add(4);
	a2.add(5);
	a2.add(6);

	    System.out.println(Collections.binarySearch(a1, 3));
	    System.out.println(a2);
	  
	    
	    Collections.copy(a2,a1);
	    System.out.println(a2);
	    Collections.swap(a1, 0, 2);
	    System.out.println(a1);
	    Collections.fill(a1,"hello");
	    System.out.println(a1);
	    System.out.println(Collections.frequency(a1, 1));
	    
	    
    }

    @Override
    public int compare(Object arg0, Object arg1) {
	// TODO Auto-generated method stub
	return 0;
    }

    
}
                                                                                                                                                                              