package basics;

public class Test {

	public static void main(String[] args) {
		int a=23,b=45;
		System.out.println(a==b);
		
		
		// second question
		
		int c=55,d=70;
		System.out.println(c<50 && c<d);
		
		// third question
		
		int e=20,f=30,temp;
		temp=f;
		f=e;
		e=temp;
		System.out.println("e = "+e);
		System.out.println("f = "+f);
		
		// fourth question
		
		int g=27;
		int modu=(g%10);
		System.out.println("The second digit is = "+modu);

	}

}
