package basics;

import java.util.Scanner;

public class Arrrayexception {

	public static void main(String[] args) {
		try
		{
		 int []ar=new int[3];
		 ar[0]=1;
		 ar[1]=3;
		 ar[3]=8;
		 ar[4]=7;
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
		 
		

	}

}
