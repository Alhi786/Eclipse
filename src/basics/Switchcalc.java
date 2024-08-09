package basics;

public class Switchcalc {

	public static void main(String[] args) {
		int op=1;int a=10;int b=5;
		switch(op)
		{
		case 1:System.out.println(a+b);
		break;
		case 2:System.out.println(a-b);
		break;
		case 3:System.out.println(a*b);
		break;
		case 4:System.out.println(a/b);
		break;
		default:System.out.println("Invalid entry");
		}
	}

}
