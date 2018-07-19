
public class Band {
 
	private String bname;
	private String[] sing;
	private String[] gu;
	private String drum;
	private String keyb;
	int c=0;
	public void setBand(String bn,String[] singer,String[] gua,String drumm,String keybo){
		
		this.bname=bn;
		this.drum=drumm;
		this.gu=gua;
		this.keyb=keybo;
		this.sing=singer;
	}
	public void dis()
	{
		System.out.println("band name :"+bname);
		System.out.print("Singers : ");
		
		for(int i=0;i<sing.length;i++)
		{
			System.out.print(sing[i]+",");
			c++;
		}	
		System.out.println();
		System.out.print("Guitarists: ");
		
		for(int j=0;j<gu.length;j++)
		{
			System.out.print(gu[j]+",");
			c++;
		}	
		System.out.println();
		System.out.println("drummer :"+drum);
		System.out.println("keyboard player :"+keyb);
	}
	public int countMem() {
		return(c+2);
	}
}
