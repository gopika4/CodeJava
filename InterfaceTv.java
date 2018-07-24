interface TVRemote
{
    public void switchOff();
    public void switchOn();
    
}
class SonyTV implements TVRemote 
{

    @Override
    public void switchOff() {
	System.out.println("Sony Tv is switched off");
	
    }

    @Override
    public void switchOn() {
	
	System.out.println("Sony Tv is switched on");
    }
    
}
class Samsung implements TVRemote
{

    @Override
    public void switchOff() {
	System.out.println("Samsung Tv is switched off");
	
    }

    @Override
    public void switchOn() {
	System.out.println("Samsung Tv is switched on");
	
    }
    
}
public class InterfaceTv {

    public static void main(String[] args) {
	SonyTV t=new SonyTV();
	t.switchOff();
	t.switchOn();
	Samsung s=new Samsung();
	s.switchOff();
	s.switchOn();
	

    }

}
