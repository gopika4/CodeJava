
public class Testcar {

    public static void main(String[] args) 
    {
	// TODO Auto-generated method stub
	Testcar t=new Testcar();
	 Car c1=new Car();
		c1.setCarDetails("Ferrari", 8.5,15000000,true);
		c1.dis();
		Car c2=new Car();
		c2.setCarDetails("Lamborgini", 10.5,14000,true);
		c2.dis();
		Car c3=new Car();
		c3.setCarDetails("Honda", 7.5,10000000,false);
		c3.dis();
		Car c4=new Car();
		c4.setCarDetails("Maruti", 5.5,100000,false);
		c4.dis();
	if(c1.price >c2.price&&c1.price >c3.price&&c1.price >c4.price)
	    System.out.println(c1.carName + " is most expensive");
	if(c2.price >c1.price&&c2.price >c3.price&&c2.price >c4.price)
	    System.out.println(c2.carName + " is most expensive");
	if(c3.price >c2.price&&c3.price >c1.price&&c3.price >c4.price)
	    System.out.println(c3.carName + " is most expensive");
	if(c4.price >c1.price&&c4.price >c3.price&&c4.price >c2.price)
	    System.out.println(c4.carName + " is most expensive");
	c1.MyCar(c1);
	c2.MyCar(c2);
	c3.MyCar(c3);
	c4.MyCar(c4);
    }
	
		    
    }
	
	
    


