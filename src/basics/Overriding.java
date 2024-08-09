package basics;

class Parent
{
	public void job()
	{
		System.out.println("teacher");
	}
	public void phone()
	{
		System.out.println("samsung");
	}
}
class 	Child extends Parent
{

	@Override
	public void job() {
		System.out.println("tester");
		super.job();
	}

	@Override
	public void phone() 
	{
		System.out.println("iphone");
		super.phone();
	}
	
}
public class Overriding {

	public static void main(String[] args) {
			Child c=new Child();
			c.job();
			c.phone();

	}

}
