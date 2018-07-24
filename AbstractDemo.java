abstract class Person6
{
    public boolean doesHeBreathe()
    {
	System.out.println("Every person breathes");
	return true;
    }
    public boolean doesHeSleep()
    {
	System.out.println("Every person sleeps");
	return true;
    }
    public abstract boolean doesHeDriveCar();
}
abstract class Employee6 extends Person6
{
    public abstract boolean doesHeDriveCar();
}
 class Driver extends Employee6 
{
    public boolean doesHeDriveCar()
    {
	System.out.println("Every drivr drives a car");
	return true;
    }
}
public class AbstractDemo {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Driver d=new Driver();
	System.out.println("Breathing?  "+d.doesHeBreathe());
	System.out.println("Sleeping?  "+d.doesHeSleep());
	System.out.println("Driving? "+d.doesHeDriveCar());

    }

}
