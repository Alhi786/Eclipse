package basics;

class Shape
{
	public void getarea()
	{
		
	}
	public void getperimeter()
	{
		
	}
}
class Circle extends Shape
{
	@Override
	public void getarea() 
	{
		double r1=4;
		double area=3.14*r1*r1;
		System.out.println("area of circle : "+area);
		super.getarea();
	}

	@Override
	public void getperimeter() 
	{
		double r2=4;
		double perimeter=2*3.14*r2;
		System.out.println("perimeter of circle : "+perimeter);
		super.getperimeter();
	}
	
}
class Rectangle extends Shape
{

	@Override
	public void getarea() 
	{
		int l=5,b=7;
		int area=l*b;
		System.out.println("area of reactangle : "+area);
		super.getarea();
	}

	@Override
	public void getperimeter() 
	{
		int len=4,bre=7;
		int perimeter=2*(len*bre);
		System.out.println("perimeter of rectangle : "+perimeter);
		super.getperimeter();
	}
	
}
class Triangle extends Shape
{

	@Override
	public void getarea() 
	{
		double b1=5,h1=7;
		double area=0.5*b1*h1;
		System.out.println("area of triangle : "+area);
		super.getarea();
	}

	@Override
	public void getperimeter() 
	{
		int a=4,b2=5,c=7;
		int perimeter=a+b2+c;
		System.out.println("perimeter of triangle : "+perimeter);
		super.getperimeter();
	}
	
}


public class Overrideprblm {

	public static void main(String[] args) {
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		c.getarea();
		c.getperimeter();
		r.getarea();
		r.getperimeter();
		t.getarea();
		t.getperimeter();
		

	}

}
