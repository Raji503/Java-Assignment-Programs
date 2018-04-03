// Question No 14:

//Write a program in Java to create Generic Class to accept Employee Age and Salary


import java.util.Scanner;

class MyGen<T>
{  
	T obj;  
	
	void add(T obj)
	{
		this.obj=obj;

	}  

	T get()
	{
		return obj;
	
	}
  
}  


class genericclass 
{  
	public static void main(String args[])
	{  

		int age=0;
		
		int salary=0;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the total number of Employees: ");

		int n=sc.nextInt();

		MyGen<Integer> m=new MyGen<Integer>(); 
	
		int i=0;

		while(i<n)
		
		{

			System.out.println("\n" +"\n" +"Enter Employee age and salary:"); 

			age=sc.nextInt();

			salary=sc.nextInt();
		
			m.add(age); 
 
			m.add(salary);  

			i++;

			System.out.println("\n" +"Employee age and salary details are: " +"\n"  +"Employee age : " +age  +"\n" +"Employee salary : " +salary); 
	
		}

			
	}

	
}  