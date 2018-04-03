//Question No 5:

//Write a program to accept marks of 10 students using array and display the name of highest scorer


import java.util.Scanner;

public class highestscorer
{
	public static void main(String args[])
	{
		int largest;
		
		String name[]=new String[10];
		
		int marks[]=new int[10]; 

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name and marks of the 10 students");
		
	
		for(int i=0;i<10;i++)
		{			

			System.out.println("Enter name of the student: ");
			
			name[i]=sc.next();

			System.out.println("Enter marks of the student: ");

			marks[i]=sc.nextInt(); 

		}

		largest=marks[0];

		String highscorer=name[0];
			
											
		for(int i=0;i<10;i++)
		{
			if(marks[i] > largest)
			{

			largest=marks[i];

			highscorer=name[i];			
			
			}
	
		}


		System.out.println("The largest number is "  +largest);

		System.out.println("The name of highest scorer is: " +highscorer);


	}
}