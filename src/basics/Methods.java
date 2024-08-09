package basics;

public class Methods {

	public static void main(String[] args) {
		Methods m=new Methods();
		m.para();
		m.sub(30, 20);
		m.mul(10, 5);
		m.div();


	}
	//without returntype without parameters
	public void para()
	{
		int a=10;int b=15;
		int sum=a+b;
		
		System.out.println(sum);
	}
	
	//without returntype with parameters
	public void sub(int c,int d) 
	{
		int sub=c-d;
		System.out.println(sub);
	}
	
	//with returntype with parameters
	
	public int mul(int e,int f)
	{
		int mul=e*f;
		System.out.println(mul);
		return mul;
	}
	
	//with returntype without parameters
	
	public int div()
	{
		int g=10;int h=5;
		int div=g/h;
		System.out.println(div);
		return div;
		
	}
}
