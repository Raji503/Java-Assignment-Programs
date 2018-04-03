//Question No: 1

import java.util.Scanner;

public class eligiblestudents
{
	public static void main(String args[])
	
	{
		String studname;
		
		int studage;

		Scanner sc=new Scanner(System.in);

		int i=1;
 
		int count=0;

		int cnt=0;

		while(i<=10)
		{

			System.out.println("Enter the student name");

			studname=sc.next();
	
			System.out.println("Enter the student age");

			studage=sc.nextInt();
	
			if(studage>=18 && studage<25)
			{
				count=count+1;
			}
			else if(studage<18 || studage>25)
			{
				cnt=cnt+1;
			}
						
			i++;
		
		}

		System.out.println("The number of students eligible for taking admision in Graduation 1st year are: " +count);

		System.out.println("The number of students not eligible for admision are: " +cnt);


	}

}