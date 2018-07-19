//@GopikaV
//18th July 2018
public class Car {
    String carName;
    double mileage;
    double price;
    boolean luxurytype;
    public void setCarDetails(String carNam,double mileag,double pric,boolean luxuryTyp )
    {
	carName=carNam;
	mileage=mileag;
	price=pric;
	luxurytype=luxuryTyp;
	
    }
    public void dis()
    {
	System.out.println("Name: " + carName);
	System.out.println("Mileage: " + mileage);
	System.out.println("Price: " + price);
	System.out.println("Luxury type: " + luxurytype);
	System.out.println();
    }

    public void MyCar(Car c)
	{

	     
	    if(c.mileage >10 && c.price<230000)
		System.out.println(c.carName +" is best car");
	
	}
}
