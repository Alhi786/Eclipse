package basics;

public class Polymorphism {

	public static void main(String[] args) {
		Polymorphism p=new Polymorphism();
		p.add();
		p.add(10, 20);
		p.add(10, 20);
		p.add(0, 0);

	}
public void add() 
{
	int a=20,b=15;
	int sum=a+b;
	System.out.println(sum);
}
public void add(int a,int b)
{
	int sum=a+b;
	System.out.println(sum);
}
public void add(int a,double b)
{
	double sum=a+b;
	System.out.println(sum);
}
public void add(double a,int b)
{
	double sum=a+b;
	System.out.println(sum);

}
public void add(int a,int b,int c)
{
	int sum=a+b+c;
	System.out.println(sum);
}
}
