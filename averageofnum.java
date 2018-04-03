//Question No 4:

//Write a program to accept 10 number using array and display the sum and average of 10 numbers.


import java.util.Scanner;

public class averageofnum
{
	static double sum=0;

	public double calcsum(int num)
	{

		sum=sum+num;			
		
		return sum;
		
	}

	public static void main(String args[])
	{	
		
		averageofnum ob=new averageofnum();

		Scanner sc=new Scanner(System.in);
	
		int num[] = new int[10];

		System.out.println("Enter the 10 numbers");
				
		for(int i=0; i<10;i++)
		{

			num[i]=sc.nextInt();
	
			sum=ob.calcsum(num[i]);
		
			
		
		}

		double average=sum/10;

		System.out.println("The sum of 10 numbers is: " +sum);

		System.out.println("The average of 10 numbers is: " +average);
		
	}
}
