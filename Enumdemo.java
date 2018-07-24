
public class Enumdemo {
    enum weekday{Sunday,Monday,Tuesday,Wednwsday,Thursday,Friday,Saturday};
    
    
    public static void main(String[] args) {
	weekday[] w=weekday.values();
	for(weekday w1:w)
	    System.out.println(w1);
	System.out.println(weekday.Tuesday);

    }

}
