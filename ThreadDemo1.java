class FirstThread extends Thread
{
    public void run()
    {
	for(int i=0;i<=5;i++)
	    System.out.print(i);
    }
}

public class ThreadDemo1 {

    public static void main(String[] args) {
	FirstThread nt=new FirstThread();
	nt.setName("MyThread1");
	
	SecondThread at=new SecondThread();
	at.setName("MyThread2");
	nt.start();
	at.start();
	
    }

}
class SecondThread extends Thread
{
    public void run()
    {
	for(int i=15;i<=20;i++)
	    System.out.print(i);
    }
}