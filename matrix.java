// Question No 9:

//Write a Java Program to display matrix of 3 rows and 3 columns


import java.util.Scanner;

public class matrix
{
	
	public static void main(String args[])	
	
	{
	
		int num[][]=new int[3][3];

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the matrix data");
	
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				num[i][j]=sc.nextInt();
			}
		}
	
		System.out.println("Matrix of 3 rows and 3 columns" +"\n");

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
		
				System.out.print("\t" +num[i][j]);
			}
			System.out.print("\n");
		}

	}

}