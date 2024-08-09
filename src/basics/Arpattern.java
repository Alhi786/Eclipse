package basics;
import java.util.Scanner;
public class Arpattern {

	public static void main(String[] args) {
		Scanner pat=new Scanner(System.in);
		System.out.println("Enetr the row size");
		int r=pat.nextInt();
		System.out.println("Enter the coloumn size");
		int c=pat.nextInt();
		int [][] ar=new int[r][c];
		System.out.println("Enter the values");
		for(int i=0;i<=r-1;i++)
		{
			for(int j=0;j<=c-1;j++)
			{
				ar[i][j]=pat.nextInt();
			}
				
		}
		for(int i=0;i<=r-1;i++)
		{
			for(int j=0;j<=c-1;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		

	}

}
