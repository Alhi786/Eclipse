package basics;

import java.util.Scanner;

public class Array { 

	public static void main(String[] args) {
		Scanner arr=new Scanner(System.in);
		System.out.println("Enter the size");
		int a=arr.nextInt();
		int [] ar=new int[a];
		System.out.println("Enter the numbers");
		for(int i=0;i<=a-1;i++)
		{
			ar[i]=arr.nextInt();
		}
		
		
		for(int i=0;i<=a-1;i++)
		{
			System.out.println(ar[i]);
		}

	}

}
