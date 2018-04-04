//Question No 8:

/** Write a Java Program to accept the Name and Salary of five employees using array variable and perform below task.

	1. Display the name of employee who is getting paid highest
	2. Display the name of employee who is getting paid Lowest
	3. Display the Average Salary of Employees.
**/

import java.util.Scanner;

class emparray
{
	public static void main(String d[])
	{
		int max=0;
		int x=0;int y=0;

		Scanner s=new Scanner(System.in);
		
		String name[]=new String[5];
		int sal[]=new int[5];
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the name");
			name[i]=s.next();

			System.out.println("Enter the salary");
			sal[i]=s.nextInt();
		}
		
		int min=sal[0];
		
		for(int j=0;j<5;j++)
		{
			if(sal[j]>max)
			{
				max=sal[j];
				x=j;
			}
			else if(sal[j]<min)
			{
				min=sal[j];
				y=j;
			}
		}
	
		System.out.println("Name of max sal is :"+name[x]+" "+max +"\n");

		System.out.println("Name of min sal is :"+name[y]+" "+min +"\n");

		int sumsal=0;

		for(int k=0;k<5;k++)
		{

			sumsal=sumsal+sal[k];

		}

		System.out.println("Sum of total salary of Employees: "  +sumsal +"\n");

		double avg=sumsal/5;

		System.out.println("Average Salary of Employees: "  +avg +"\n");

	}
}