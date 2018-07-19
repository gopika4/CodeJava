//@GopikaV
//16th July 2018
public class Student {
	
	String name;
	int m1,m2,m3,result;
	char grade;
	public  void grad(){
		int tot;
		tot=(m1+m2+m3)/3;
		
		if(tot>=90)
			grade='A';
		else if(tot>=80)
			grade='B';
		else if(tot>=70)
			grade='C';
		else if(tot>=60)
			grade='D';
		else
			grade='E';
		System.out.println("Total : "+ tot);
	}
	public  void display(){
		System.out.println("Name : "+name);
		System.out.println("Grade : "+grade);
		
	}

	
public static void main(String args[])
	{
		Student s=new Student();
		s.name="Akku";
		s.m1=50;
		s.m2=80;
		s.m3=70;
		s.grad();
		s.display();
	}

}
