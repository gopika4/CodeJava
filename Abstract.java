abstract class  Person
{
    abstract public void whatDoYouDo();
    {
	
    }
    public boolean doYouSpeak()
    {
	System.out.println("Every person speaks");
	return true;
    }
}
class Trainer extends Person 
{
    public void whatDoYouDo()
    {
	System.out.println("Delivers lecturers");
    }
    public boolean doYouSpeak()
    {

	return true;
    }
    
}
class Doctor extends Person 
{
    public void whatDoYouDo()
    {
	System.out.println("cures ill");
    }
    public boolean doYouSpeak()
    {
	
	return true;
    }
}
class Pilot extends Person 
{
    public void whatDoYouDo()
    {
	System.out.println("files the aeroplane");
    }
    public boolean doYouSpeak()
    {
	
	return true;
    }
}


public class Abstract {

    public static void main(String[] args) {
	Trainer t=new Trainer();
	Doctor d=new Doctor();
	Pilot p=new Pilot();
	System.out.println("Trainer");
	System.out.print("Speak ? " + t.doYouSpeak()+ "\nWhat does they do? " );
	t.whatDoYouDo();
	System.out.println("Doctor");
	System.out.print("Speak ? " + d.doYouSpeak() +"\nWhat does they do? " );
	d.whatDoYouDo();
	System.out.println("Pilot");
	System.out.print("Speak ? " + p.doYouSpeak() +"\nWhat does they do? " );
	p.whatDoYouDo();
    }

}
