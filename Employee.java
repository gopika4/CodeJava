
public class Employee {

	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	public static String cn="Delottie";
	Employee(int eid,String ename,double esalary)
	{
		this.employeeId=eid;
		this.employeeName=ename;
		this.employeeSalary=esalary;
	}
	Employee()
	{
		this.employeeId=102;
		this.employeeName="Vishnu";
		this.employeeSalary=20000;
	}
	public String getCompanyname()
	{
		
		return cn;
	}
	public double calbonus()
	{
		double bonus=0.0;
		if(this.employeeSalary >5000)
				bonus=this.employeeSalary*.2;
		else
			bonus=this.employeeSalary*.1;
		return bonus;
	}
}
