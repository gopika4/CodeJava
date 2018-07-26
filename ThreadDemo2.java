class AlphaThread implements Runnable
{
    

    @Override
    public void run() {
       for(char c='a';c<='e';c++)
	   System.out.print(c);
        
    }
}
class NumberThread implements Runnable
{
    @Override
    public void run() {
       for(int i=0;i<=5;i++)
	   System.out.print(i);
        
    }
}
public class ThreadDemo2 {

    public static void main(String[] args) {
	Thread at=new Thread(new AlphaThread());
	Thread nt=new Thread(new NumberThread());
	at.start();
	nt.start();

    }

}
