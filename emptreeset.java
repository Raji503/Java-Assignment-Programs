//Question No 16:

/** Write a Java Program to Accept Employee Details by Using TreeSet. Enter the data in any order 
but display the data by arranging as per EmployeeID using Comparator interface.
1. Employee Name
2. Employee ID
3. Employee Age
**/


import java.util.*;

class Employee
{
	private int id;
	private String name;
	private int age;
	
	Employee(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}

	public int getId()
	{

		return id;
	}

	public void setId(int id)
	{

		this.id= id;
	}

	public String getName()
	{

		return name;
	}

	public void setName(String name)
	{

		this.name= name;
	}

	public int getAge()
	{

		return age;
	}
	public void setAge(int age)
	{

		this.age=age;
	}

	public String toString()
	{

		return "Name :"+name+"id :"+id+"age :"+age;
	}
}


class EmployeeCompare implements Comparator<Employee>
{
	
	public int compare(Employee o1,Employee o2)
	{

		if(o1.getId() > o2.getId())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}


class emptreeset
{
	public static void main(String d[])
	{

		Employee e1=new Employee(104,"Sandhiya",23);
		Employee e2=new Employee(103,"Sonica",21);
		Employee e3=new Employee(101,"Raji",25);
		Employee e4=new Employee(102,"Sonali",24);
		Employee e5=new Employee(106,"Poorani",23);
		Employee e6=new Employee(105,"Shanavas",22);

		Set<Employee> eSet=new TreeSet<Employee>(new EmployeeCompare());

		eSet.add(e1);
		eSet.add(e2);
		eSet.add(e3);
		eSet.add(e4);
		eSet.add(e5);
		eSet.add(e6); 

		System.out.println("Employee details after sorting as per Employee ID: " +"\n");

		for(Employee e : eSet)
		{

			System.out.println("Employee Id: " +e.getId());
			System.out.println("Employee Name: " +e.getName());
			System.out.println("Employee Age: " +e.getAge());
			System.out.println("\n");
		}
	}
}