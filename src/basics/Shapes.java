package basics;

interface Drawable
{
	void draw();
}
class Circleee implements Drawable
{

	@Override
	public void draw() 
	{
		String shape="circle";
		System.out.println("Shape is : "+shape);
		
	}
	
}
class Rectangleee implements Drawable
{

	@Override
	public void draw() 
	{
		String shape="rectangle";
		System.out.println("shape is : "+shape);
		
	}
	
}
class Triangleee implements Drawable
{

	@Override
	public void draw() 
	{
		String shape="triangle";
		System.out.println("shape is : "+shape);
		
	}
	
}

public class Shapes {

	public static void main(String[] args) 
	{
		Circleee c=new Circleee();
		Rectangleee r=new Rectangleee();
		Triangleee t=new Triangleee();
		c.draw();
		r.draw();
		t.draw();

	}

}
