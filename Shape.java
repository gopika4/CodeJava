//@GopikaV
//16th July 2018
class Circle
{
    double r;
}
class Triangle
{
    double h,b;
}
class Square
{
    double ss;
}
public class Shape {
    double area;
    public double calarea(Circle c)
    {
	area=c.r*c.r*3.14;
		return area;
    }
    public double calarea(Triangle t)
    {
	area=t.h*t.b*0.5;
		return area;
    }
    public double calarea(Square s)
    {
	area=s.ss*4;
		return area;
    }
    

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Shape sh=new Shape();
	Square s=new Square();
	s.ss=4;
	Circle c=new Circle();
	c.r=20;
	Triangle t=new Triangle();
	t.b=12;
	t.h=10;
	System.out.println(sh.calarea(c));
	System.out.println(sh.calarea(s));
	System.out.println(sh.calarea(t));

    }

}
