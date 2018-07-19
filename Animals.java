
public class Animals {

    	public void speak()
    	{
    	    System.out.println("Animals speaks");
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
    public static void main(String[] args) {
	// TODO Auto-generated method stub
		String aname="Dog";
		
		animalname(aname);
		
    }
    public static void animalname(String aname)
    {
	Animals a=null;
	if(aname.equals("Cat"))
		a=new Cat();
	if(aname.equals("Dog"))
		a=new Dog();
	if(aname.equals("Horse"))
		a=new Horse();
	anispeak(a);
	
    }
    public static void anispeak(Animals a)
    {
	a.speak();
    }
}
