//Question No: 3

//Write a program using array to accept 10 numbers and display the numbers in ascending order.


import java.util.Scanner;

public class sortascen
{
	public static void main(String args[])

	{
		int num[]=new int[10]; 

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the 10 numbers");

		for(int i=0;i<10;i++)
		{
			num[i]=sc.nextInt();
		}

		int temp;

		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				
				if(num[j]>num[j+1])
				{
					temp=num[j];

					num[j]=num[j+1];

					num[j+1]=temp;
				}

			}

		}

		System.out.println("The numbers in ascending order: ");

		for(int i=0;i<10;i++) 

		System.out.println(num[i]);


	}



}