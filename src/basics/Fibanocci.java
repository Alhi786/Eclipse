package basics;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		int firstnum=0;
		int secondnum=1;
		System.out.println("Enter the end number for fibanocci : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Fibanocci series till "+ n + "numbers :");
		for (int i=1;i<=n;++i)
		{
			System.out.print(firstnum + " ");
			
			int nextnum=firstnum + secondnum;
			firstnum=secondnum;
			secondnum=nextnum;
		}
		System.out.println();

	}

}
