//@GopikaV
//16th July 2018
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String co[]= {"India","Italy","England","France","Australia"};
		String cap[]= {"Delhi","Rome","London","Paris","Canberra"};
		String coun="England";
		int ass=0;
		System.out.print("Capital of ");
		for(int i=0;i<co.length;i++)
		{
			if(co[i].equals(coun))
			{
					System.out.print(co[i]+ " is ");
			ass=i;
			break;
			} 
		}
		System.out.print(cap[ass]);
}
	
}
