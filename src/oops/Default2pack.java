package oops;

import basics.Testdefault;

class Default2 extends Testdefault
{
	public void print()
	{
	System.out.println(a);	
	}
}

public class Default2pack {

	public static void main(String[] args) {
		Testdefault df2=new Testdefault();
		System.out.println(df2.a); //default in another package checked(not working)
		Default2 d=new Default2();
		d.print(); //default in another package with subclass checked(not working)
	}

}
