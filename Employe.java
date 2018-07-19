class Empe
{
    double salary;
    String name;
    int eid;
    String dept;
    Address add;
    Empe(double salary,String name,int eid,String dept,Address add)
    
    {
	this.salary=salary;
	this.name=name;
	this.eid=eid;
	this.dept=dept;
	this.add=add;
    }
    public void printEmployeeDetails()
    {
	System.out.println(this.name);
	System.out.println(this.salary);
	System.out.println(this.eid);
	System.out.println(this.dept);
	add.printAddressDetails();
	
    }
}
class Address
{
    int flatno;
    String apartmentname;
    String main;
    String cross;
    String city;
    long pinCode;
    Address(int flatNo,String apartmentname,String main,String cross,String city,long pinCode)
    {
	this.flatno=flatno;
	this.apartmentname=apartmentname;
	this.main=main;
	this.cross=cross;
	this.city=city;
	this.pinCode=pinCode;
	
    }
    public void printAddressDetails()
    {
	System.out.println(this.flatno);
	System.out.println(this.apartmentname);
	System.out.println(this.main);
	System.out.println(this.cross);
	System.out.println(this.city);
	System.out.println(this.pinCode);
	
    }
}
public class Employe {
    public static void main(String args[])
    {
	Address a=new Address(1112, "Shanthini", "7th main", "8th cross", "Mumbai", 532345);
	Empe e = new Empe(12345.6, "Peter", 123, "Finance",a);
	e.printEmployeeDetails();

    }

}
