// Question No 15:

/** Write a program in Java to perform all the operations related with HashMap. 
	1. Store Employee Details by using Employee Class
	2. Traverse Employee Details stored in Collection Object
	3. Delete Employee Details
	4. Update Employee Details
**/



import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class employee
{
	public static void main(String arg[])
    	{
        	HashMap<Integer,String> empdetails=new HashMap<Integer,String>();

		System.out.println("Size of HashMap before adding Employee Details:  " +empdetails.size() +"\n");
		

        	empdetails.put(101,"Soni");
	        empdetails.put(102,"Raji");
	        empdetails.put(103,"Shanavas");
        	empdetails.put(104,"Sonali");
	        empdetails.put(105,"Poorani");
	        empdetails.put(106,"Aravind");
	        empdetails.put(107,"Sandhiya");
	        empdetails.put(108,"Amanath");
	        

		//retrieving all details

		Set set=empdetails.entrySet();

		Iterator itr1=set.iterator();

		System.out.println("Employee Details: " +"\n");

		while(itr1.hasNext())
		{
			Map.Entry mapentry=(Map.Entry)itr1.next();

			System.out.println(mapentry.getKey() +"\t" +mapentry.getValue() +"\n");

		}
	
		System.out.println("Size of HashMap after adding Employee Details:   " +empdetails.size() +"\n");

		empdetails.remove(101);

		Iterator itr2=set.iterator();

		System.out.println("\n" +"After removing the first Employee Details :" +"\n");	

		while(itr2.hasNext())
		{
			Map.Entry mapentry=(Map.Entry)itr2.next();

			System.out.println(mapentry.getKey() +"\t" +mapentry.getValue() +"\n");

		}

		empdetails.put(108,"Amritha");

		Iterator itr3=set.iterator();

		System.out.println("\n" +"After updating the Employee Details :" +"\n");	

		while(itr3.hasNext())
		{
			Map.Entry mapentry=(Map.Entry)itr3.next();

			System.out.println(mapentry.getKey() +"\t" +mapentry.getValue() +"\n");

		}


		empdetails.clear();	

		Iterator itr4=set.iterator();

		System.out.println("\n" +"After clearing all Employee Details :" +"\n");	

		while(itr4.hasNext())
		{
			Map.Entry mapentry=(Map.Entry)itr4.next();

			System.out.println(mapentry.getKey() +"\t" +mapentry.getValue() +"\n");

			
		}
	

				
		System.out.println("Size of HashMap after clearing all Employee Details:   " +empdetails.size()+"\n");	

	}


}