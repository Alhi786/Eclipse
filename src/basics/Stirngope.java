package basics;

public class Stirngope {

	public static void main(String[] args) {
		String a="Hello";
		String b=" Kochi";
		String c="hello";
		String d="Hello kakkanad";
		String f="    hii";
	
		//concat
		
		System.out.println(a.concat(b));
		System.out.println(a+b);
		String e=(a+b);
		System.out.println(e+c);
		
		//equals
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equalsIgnoreCase(c));
		
		//conatins
		System.out.println(d.contains(a));
		
		//touppercase
		System.out.println(d.toUpperCase());
		
		//tolowercase
		System.out.println(d.toLowerCase());
		
		//starts with
		System.out.println(d.startsWith(a));
		
		//ends with
		System.out.println(d.endsWith(b));
		
		//charAt
		System.out.println(d.charAt(3));
		
		//length
		System.out.println(a.length());
		
		//trim
		System.out.println(f.trim());
		
		//foreach
		int ar[]= {1,2,3,4};
		for(int v:ar)
		{
			System.out.println(v);
		}
		
		//tochararray
		
		char x[]=a.toCharArray();
		for(char s:x)
		{
			System.out.println(s);
		}
		
		//split
		
		String word[]=a.split("e");
		for (String m:word)
		{
			System.out.println(m);
		}
			
		

	}

}
