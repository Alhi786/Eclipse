package basics;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		System.out.println("Enter a number to reverse :");
		Scanner re=new Scanner(System.in);
		int number = re.nextInt();
		int rev=0;
		while(number != 0)
		{
			int digit=number % 10;
			rev = rev * 10 + digit;
			number = number/10;
		
		}
			System.out.println("Reversed number is : "+rev);
	

	}

}
