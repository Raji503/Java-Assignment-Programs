// Question No 7:

/** Write a menu driven program for calculator using Java Language. Menu Details are mentioned below :-

	1. Addition
	2. Substraction
	3. Multiplication
	4. Division
	5. Percentage
	6. Exit
**/


import java.util.Scanner;

public class calculator
{

	public void calc()
	{
		int a,b;

		int add,sub;
	
		double mul,div,perct;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the 2 numbers for calculation:");

		a=sc.nextInt();

		b=sc.nextInt();

		System.out.println("\n" +"Enter your choice");

		System.out.println("\n" +"1.Addition" +"\n" +"2.Subtraction" +"\n" +"3.Multiplication" +"\n" +"4.Division" +"\n" +"5.Percentage" +"\n" +"6.Exit");
	
		int choice=sc.nextInt();

		switch(choice)
		{
			case 1:
			{
				add=a+b;
				System.out.println("Addition of given two numbers is: " +add);
				break;
			}
		
		
			case 2:
			{
				sub=a-b;
				System.out.println("Subtraction of given two numbers is: " +sub);
				break;
			}
		
			case 3:
			{
				mul=a*b;
				System.out.println("Multiplication of given two numbers is: " +mul);
				break;
			}
			case 4:
			{
				if(b!=0)
				{			
					
					if(a<b)	
					{
						double a1=(double)a;
						double b1=(double)b;
						div=a1/b1;
						System.out.println("Division of given two numbers is: " +div);
					}
					else 
					{
						div=a/b;
						System.out.println("Division of given two numbers is: " +div);
					}
				}
				else
				{
					System.out.println("Divisor should be greater than zero");
				}
				break;
			

			}
			case 5:
			{

				if(b!=0)
				{	
					if(a<b)
					{
						double a1=(double)a;
						double b1=(double)b;
						perct=(a1/b1)*100;
						System.out.println("Percentage of given two numbers is: " +perct);
					}
					else 
					{
						perct=(a/b)*100;
						System.out.println("Percentage of given two numbers is: " +perct);
					}
				}
				else
				{
					System.out.println("Divisor should be greater than zero");
				}
				break;
			
			}
			case 6:
			{
			
				System.out.println("Exit the Calculator");
				break;
			}
			default:
			{
				System.out.println("Invalid choice");
				return;
			}

	
		}

	}

	public static void main(String args[])
	{
		calculator ob=new calculator();
		ob.calc();
		
	}

}