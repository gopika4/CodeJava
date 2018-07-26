class EatFood
{
    public synchronized void takeLunch()
    {
	System.out.println("Table 01 free");
    } 
}
class EatFoodThread extends Thread
{
   EatFood e;
    public EatFoodThread(EatFood e)
    {
	
	this.e=e;
    }
    public void run()
    {
	e.takeLunch();
    }
}
public class SyncDemo {

    public static void main(String[] args) {
	EatFood ef=new EatFood();
	EatFoodThread e1=new EatFoodThread(ef);
	EatFoodThread e2=new EatFoodThread(ef);
	e1.start();
	e2.start();


    }

}
