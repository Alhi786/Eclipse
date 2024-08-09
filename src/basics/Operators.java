package basics;

public class Operators {

	public static void main(String[] args) {
		int a=10,b=15;
		int sum=(a+b);
		System.out.println("sum is ="+sum);
		
		int sub=(a-b);
		System.out.println("difference is ="+sub);
		
		int mult=(a*b);
		System.out.println("product is ="+mult);
		
		int div=(a/b);
		System.out.println("division is ="+div);
		
		double mod=(a%b);
		System.out.println("reminder is ="+mod);
		
		int c=125;
		int modu=(c%100);
		System.out.println("last two digits is = "+modu);
		
		// Realtion operators
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		// unary operators
		
		int d=20;
		System.out.println(b++);
		System.out.println(b);
		System.out.println(b--);
		System.out.println(b);
		
		// logical operators
		
		String username="abcd";
		String password="abc123";
		System.out.println(username=="abcd" && password=="abc123");
		System.out.println(username=="abcd" || password=="adfgf");
		System.out.println(username!="abcd");
	}

}
