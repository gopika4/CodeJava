class Greeting
{
    public synchronized void sayHello(String name)
    {
	System.out.print("!");
	System.out.print(name);
	System.out.println("!");
    }
}
class GreetingThread extends Thread
{
    String name;
    Greeting greeting;
    public GreetingThread(String name,Greeting greeting) 
    {
	this.name=name;
	this.greeting=greeting;
    }
    public void run()
    {
	greeting.sayHello(this.name);
    }
}
public class SynchronizedDemo {

    public static void main(String[] args) 
    {
	Greeting g=new Greeting();
	GreetingThread gt1=new GreetingThread("Gopika", g);
	GreetingThread gt2=new GreetingThread("Akku", g);
	gt1.start();
	gt2.start();

    }

}
