package basics;

public class Factorial {

	public static void main(String[] args) {
		int i; int fact=1;
		for(i=1;i<=5;i++)
		{
			fact=(fact*i);
		}
		System.out.println("factorial of 5 is "+fact);

	}

}
