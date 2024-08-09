package basics;

public class Reversethestring {

	public static void main(String[] args) {
		String word="Luminar kochi";
		String revst="";
		char c;
		System.out.println("Given string : "+word);
		for(int i=0;i<word.length();i++)
		{
			c=word.charAt(i);
			revst=c+revst;
		}
		System.out.println("Reversed string is : "+ revst);

	}

}
