//Question No 17:

/** Write program in java to create a base class name for accepting Studnet Details of Science Stream with common properties. After that create child classes of various Science Stream like (Maths, Biology, Computer, Electronics)
After that also create the another child class (Software,Hardware),(Botany,Zoology) on class like Computer and Biology
**/


import java.util.Scanner;

class sciencestream
{
	void m1()
	{
		String name;
		int id;

		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the student Name: ");

		name=s.next();

		System.out.println("Enter the student Id: ");

		id=s.nextInt();

		System.out.println("The Student details are: " +"\n");

		System.out.println("Student Name:"  +name +"\n");
		System.out.println("Student Id:" +id);
	}


	class Maths extends sciencestream
	{

	}
	class Biology extends sciencestream
	{
	
	}
	class Computer extends sciencestream
	{
	
	}
	class Electronics extends sciencestream
	{

	}
	class Software extends Computer
	{

	}
	class Hardware extends Computer
	{

	}
	class Botany extends Biology
	{

	}
	class Zoology extends Biology
	{

	}	
	
	public static void main(String d[])
	{
		sciencestream ob=new sciencestream();
		ob.m1();
	}
}

