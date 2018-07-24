class A
{
    int a=50;
}
class B extends A
{
    int a=30;
    int b=2;
}
class C extends B
{
    int a=20;
}
public class MultiHeritence {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	C c1=new C();
	System.out.println(c1.a);
	System.out.println(((A)c1).a);
	A a1=new C();
	C c=(C)a1;
	System.out.println(a1.a);
	
    }
}
