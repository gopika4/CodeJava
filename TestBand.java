
public class TestBand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Band b1=new Band();
		Band b2=new Band();
		String  a1[]= {"achu","akhil","ammu"};
		String a2[]= {"Vivek","akku"};
		String c1[]={"vichu","vimala"};
		String c2[]={"riya","harry"};
		b1.setBand("Apollo",a1,a2,"vishnu","priya");
		b1.dis();
		System.out.println();
		b2.setBand("venus",c1 ,c2,"chole","lisa");
		b2.dis();
		if(b1.countMem()>b2.countMem())
			System.out.println("1 has more members");
		else
			System.out.println("2 has more members");
	}

}
