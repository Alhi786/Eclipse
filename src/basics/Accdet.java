package basics;

import java.util.Scanner;

interface Bank
{
	 void accountdetails();
	 void balance();
	 void deposit();
	 void withdrawal();
}
class Sbi implements Bank
{
	int bal=0;
	@Override
	public void accountdetails() 
	{
		String bankname="sbi";
		String accholder="abcde";
		int accnum=1234556;
		System.out.println(bankname);
		System.out.println(accholder);
		System.out.println(accnum);
	}

	@Override
	public void balance() 
	{
		System.out.println(bal);
		
	}

	@Override
	public void deposit() 
	{
		System.out.println("Enter the amount you want to deposit");
		Scanner sc=new Scanner(System.in);
		int deposit=sc.nextInt();
		bal=bal+deposit;
		System.out.println("your account balance is : "+bal);
		
	}

	@Override
	public void withdrawal() 
	{
		System.out.println("Enter the amount you want to withdraw");
		Scanner sc=new Scanner(System.in);
		int withdrawal =sc.nextInt();
		bal=bal-withdrawal;
		System.out.println("your account balance is : "+bal);
		
	}
	
}


public class Accdet {

	public static void main(String[] args) {
		Sbi s=new Sbi();
		s.accountdetails();
		s.balance();
		s.deposit();
		s.withdrawal();
		

	}

}
