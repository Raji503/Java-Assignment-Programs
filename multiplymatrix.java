// Question No 11:

//Write a Java Program to do product of 2 matrices of 3 rows and 3 columns


import java.util.Scanner;

public class multiplymatrix
{
	
	public static void main(String args[])	
	
	{
	
		int num1[][]=new int[3][3];

		int num2[][]=new int[3][3];

		int mul[][]=new int[3][3];

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the matrix data of num1");
	
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				num1[i][j]=sc.nextInt();
			}
		}

		System.out.println("Enter the matrix data of num2");

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				num2[i][j]=sc.nextInt();
			}
		}
 
		System.out.println("The given 2 matrices are: ");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print("\t" +num1[i][j]); 
				
			}
			System.out.print("\n");

		}

		System.out.print("\n" +"\n");

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print("\t" +num2[i][j]); 
				
			}
			System.out.print("\n");

		}
	
		System.out.println("Multiplication of 2 matrices of 3 rows and 3 columns" +"\n");

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
					mul[i][j]=mul[i][j] + (num1[i][k]*num2[k][j]);
				
				}
				
				System.out.print("\t" +mul[i][j]);		
	
			}
			System.out.print("\n");
		}

	}

}