//@GopikaV
//16th July 2018
public class salary {

	public static void main(String[] args) {
		double sal=15000,tax,allow,net;
		tax=(sal*10)/100;
		allow=(sal*15)/100;
		net=sal+allow-tax;
		System.out.println("Tax = " +tax);
		System.out.println("Allowance = " +allow);
		System.out.println("Net salary = " +net);

	}

}
