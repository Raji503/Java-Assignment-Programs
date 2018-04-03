//Question No 2:

import java.util.Scanner;

class empbonus
{
	public static void main(String args[])
	{
		double bonus=0;
		
		Scanner sc=new Scanner(System.in);
		
		double bon1=0;
		double bon2=0;
		double bon3=0;
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter the Employee Name: ");
			String employeeName=sc.next();
			
			System.out.println("Enter the Employee Salary: ");
			double employeeSalary=sc.nextDouble();
		
			for(int j=0;j<10;j++)
			{
				if(employeeSalary>=100000)
				{
					bon1=0.1*employeeSalary;
				}
				else if(employeeSalary>=50000 && employeeSalary<100000)
				{
					bon2=0.2*employeeSalary;
				}
				else if(employeeSalary>=10000 && employeeSalary<50000)
				{
					bon3=0.3*employeeSalary;
				}

			}

				bonus=bon1+bon2+bon3;
		}
		

		System.out.println("Total bonus given to the employees during festival season are: " +bonus);

	}

}
