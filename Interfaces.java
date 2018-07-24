interface comparison
{
    public void whichIsGreater(Object o1, Object o2);
}
class Employee2 implements comparison
{
    String name;
    double salary;
    public Employee2(String name,double salary)
    {
	this.name=name;
	this.salary=salary;
    }
    @Override
    public void whichIsGreater(Object o1, Object o2) {
        Employee2 e1=(Employee2)o1;
        Employee2 e2=(Employee2)o2;
        if(e1.salary>e2.salary)
            System.out.println(e1.name+"has greater salary");
        else if(e1.salary<e2.salary)
            System.out.println(e2.name+"has greater salary");
            
        
    }
    
}
class Apple implements comparison
{
    String source;
    double price;
    public Apple(String source,double price) {
	this.source=source;
	this.price=price;
    }
    @Override
    public void whichIsGreater(Object o1, Object o2) {
        Apple a1=(Apple)o1;
        Apple a2=(Apple)o2;
        if(a1.price>a2.price)
            System.out.println(a1.source+" has greater price");
        else if(a1.price<a2.price)
            System.out.println(a2.source+" has greater price");
            
        
    }
    
}
public class Interfaces {

    public static void main(String[] args) {
	Employee2 e1= new Employee2("emp1",26000.0);
	Employee2 e2= new Employee2("emp2",25000.0);
	Employee2 e3= new Employee2(null,0);	
	e3.whichIsGreater(e1,e2);
	Apple a1= new Apple("Kashmir",70.0);
	Apple a2= new Apple("America",65.0);
	Apple a3= new Apple(null,0);	
	a3.whichIsGreater(a1,a2);
	
	
    }

}

