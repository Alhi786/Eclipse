package basics;
import java.util.Scanner;
public class Arrsum {

	public static void main(String[] args) {
		Scanner arsum=new Scanner(System.in);
		System.out.println("Enetr the size");
		int a=arsum.nextInt();
		int [] ar=new int[a];
		System.out.println("Enter the numbers");
		for(int i=0;i<=a-1;i++)
		{
			ar[i]=arsum.nextInt();
		}
		for(int i=0;i<=a-1;i++)
		{
			int sum=sum+ar[i];
		}
		System.out.println("Sum of the values are : "+sum);
		

	}

}
