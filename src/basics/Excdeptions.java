package basics;

public class Excdeptions {

	public static void main(String[] args) {
		try
		{
			int a=10;
			int b=0;
			int div=a/b;
			System.out.println(div);
		}
		catch (Exception e)
		{
			System.out.println("error");
		}
		int c=10;
		int d=20;
		int e=c+d;
		System.out.println(e);

	}

}
