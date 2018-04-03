//Question No 6:

//Write a java program to accept a number of any digit and reverse the numbers


import java.util.Scanner;

public class reversenumber
{
	public static void main(String args[]) 
	{
		int num,mod;

		int reversenum=0;
		
		System.out.println("Enter the number");
		
		Scanner sc=new Scanner(System.in);

		num=sc.nextInt();

		for (;num != 0;num=num/10)
		{

			mod=num%10;

			reversenum=(reversenum * 10) + mod;

			//num=num/10;

		}
		
		System.out.println("Reverse of the given number is: " +reversenum);

	}


}

