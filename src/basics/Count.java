package basics;

public class Count {

	public static void main(String[] args) {
		int count=0; int a=12345;
		while (a!=0)
		{
			a=a/10;
			count++;
		}
		System.out.println("count of numbers = "+count);

	}

}
