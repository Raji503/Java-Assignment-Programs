// Question No 12:

/** Write a java program to maintain Employee Details using ArrayList? 

Id,Name,Age,Salary

1. Add minimum 5 employee details.
2. Display it in proper order.
3. Display the name to employee having highest Salary
4. Display the details in the order of Salary
**/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;


class employee implements Comparable
{

	int empid;					//initialize variables
	String empname;
	int empage;
	double empsalary;

		
	public void setValues(int id,String name,int age,double salary)
	{
		empid=id;	
		empname=name;
		empage=age;
		empsalary=salary;
		
	}

	//getter and setter methods

	public int getId()
	{
				
		return empid;
	}

	public void setId(int empid) 
	{
      		
		this.empid = empid;
    	}	

	public String getName()
	{
			
		return empname;
	}

	public void setName(String empname) 
 	{
      			
		this.empname = empname;
    	}
	
	public int getAge()
	{
				
		return empage;
	}

	public void setAge(int empage) 
 	{
      			
		this.empage = empage;
    	}    

	public double getSalary()
	{
			
		return empsalary;
	}

	public void setSalary(double empsalary) 
  	{
      			
		this.empsalary = empsalary;
    	}
			
	public int compareTo(Object o)
	{  
        
		employee e =(employee)o;
		
		if(this.empsalary==e.empsalary)
                {  
			return 0; 
		} 
		else if(this.empsalary>e.empsalary) 
		{ 
			return 1;  
		}
		else  
		{
			return -1;
		}  
      
        }

}	


public class employeelistdetails
{	

	public static void main(String args[])
	{
            
		ArrayList<employee> emplist = new ArrayList<employee>(); // arraylist to store objects
                                

		employee emp1=new employee();  				//object 1
		
		emp1.setValues(105,"Soni",21,20000); 
		
		emplist.add(emp1);


		employee emp2=new employee();  				//object 2
		
		emp2.setValues(103,"Raji",28,25000); 
		
		emplist.add(emp2);


		employee emp3=new employee();  				//object 3
		
		emp3.setValues(104,"Shanavas",24,40000); 
		
		emplist.add(emp3);
		

		employee emp4=new employee();  				//object 4
		
		emp4.setValues(101,"Sandhiya",25,35000); 
		
		emplist.add(emp4);

		
		employee emp5=new employee();  				//object 5
		
		emp5.setValues(102,"Poorani",23,30000); 
		
		emplist.add(emp5);

		
		// Display values of the object from the array.
	
 
		Iterator<employee> itr= emplist.iterator();
		
		int i=0;
 
		System.out.println("Employee Details\n");
 
		while(itr.hasNext())
 
		{
                    	employee emp=new employee();
                    
			emp=(employee)emplist.get(i);
 
			System.out.println(" Employee Id   : "+ emp.getId());
 
			System.out.println(" Employee Name : "+ emp.getName());
		
			System.out.println(" Age           : "+ emp.getAge());
 
			System.out.println(" Salary        : "+ emp.getSalary());

			System.out.print("\n");

			itr.next();
 
			i++;
 
		}

		Collections.sort(emplist);

		Iterator<employee> itr3= emplist.iterator();
		
		int j=0;
 
		System.out.println("Employee Details after sorting in the order of Salary: \n");
 
		while(itr3.hasNext())
 
		{
                    	employee em=new employee();
                    
			em=(employee)emplist.get(j);
 
			System.out.println(" Employee Id   : "+ em.getId());
 
			System.out.println(" Employee Name : "+ em.getName());
		
			System.out.println(" Age           : "+ em.getAge());
 
			System.out.println(" Salary        : "+ em.getSalary());

			System.out.print("\n");

			itr3.next();
 
			j++;
 
		}


	 /**    for(employee em:emplist)
		{	
			
		System.out.println(em.empid+" "+em.empname+" "+em.empage +" "+em.empsalary);  
		} **/

                
		Iterator<employee> itr1 = emplist.iterator();
		
		double maxsalary=0;

		String name = null;
	
		if(itr1.hasNext())
		{
			employee e;
			e = itr1.next();
			maxsalary=e.empsalary;
		}

		Iterator<employee> itr2 = emplist.iterator();

		while(itr2.hasNext())
		{
		
			employee e1 = itr2.next();

			if(e1.empsalary>=maxsalary)
			{
				maxsalary=e1.empsalary;
				name=e1.empname;
			}						

		}

		System.out.println("The Name of the Employee having highest salary " +maxsalary +" is " +name);        
		 

	}
        
}







        