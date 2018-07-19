//@GopikaV
//18th July 2018
public class Animals {

    	public void speak()
    	{
    	    System.out.println("Animals speaks");
    	}
}   	
 class Cat extends Animals
  {
      public void speak()
  	{
  	    System.out.println("Meow Meow");
  	}
  }
  class Dog extends Animals
  {
      public void speak()
  	{
  	    System.out.println("Bow Bow");
  	}
  }
  
  class Horse extends Animals{
      public void speak()
  	{
  	    System.out.println("Heigh");
  	}
  }
  
class TestClass
{
    public static void main(String[] args) {
	// TODO Auto-generated method stub
		String anam="Dog";
		
		animalnam(anam);
		
    }
    public static void animalnam(String anam)
    {
	Animals a1 = null;
	if(anam.equals("Cat"))
	    a1=new Cat();
	else if(anam.equals("Dog"))
		a1=new Dog();
	else  if(anam.equals("Horse"))
		a1=new Horse();
	anispeak(a1);
	
    }
    public static void anispeak(Animals a)
    {
	a.speak();
    }
}
