package basics;

import java.util.Scanner;

public class Strngprblms {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		int count=0;
		char x[]=a.toCharArray();
		for(char v:x)
		{
			if( v=='a' || v=='e' || v=='i' || v=='o'	|| v=='u')
			count++;
					
		}
		System.out.println(count);
		
		// alphabets a-z
		
		char b;
		for(b='A';b<='Z';b++)
		{
			System.out.print(" "+b);
		}
	
		
	}

}
