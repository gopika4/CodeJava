//@GopikaV
//16th July 2018
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(12,"achu",23);
		double e= e1.calbonus();
		System.out.println(e);
		System.out.println(e1.getCompanyname());
		Employee e2=new Employee();
		double ee= e2.calbonus();
		System.out.println(ee);
		System.out.println(e2.getCompanyname());
		
	}

}
