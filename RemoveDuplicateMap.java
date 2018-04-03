// Question No 13:

//The Map interface allows duplicate value objects but the Key object must be unique

//Write a program in java to eliminate duplicate key in hash map as user defined object



import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Map;
import java.util.Set;


public class RemoveDuplicateMap 
{
    
	public static void main(String arg[])
    	{
        	HashMap<Integer,String> map=new HashMap<Integer,String>();

        	map.put(1,"one");
	        map.put(2,"two");
	        map.put(3,"three");
        	map.put(4,"four");
	        map.put(5,"five");
	        map.put(15,"five");
	        map.put(25,"five");
	        map.put(35,"five");
	        map.put(22,"two");
	        map.put(32,"two");
	        map.put(42,"two");

		//retrieving all details

		Set set=map.entrySet();

		Iterator itr1=set.iterator();

		System.out.println("Key and Values in HashMap" +"\n");

		while(itr1.hasNext())
		{
			Map.Entry mapentry=(Map.Entry)itr1.next();

			System.out.println(mapentry.getKey() +"\t" +mapentry.getValue() +"\n");

		}
       
        
        	Set<String> valueset=new TreeSet<String>(map.values());

	        System.out.println("Set of unique values" +"\n");

	        System.out.println(valueset +"\n");

        	Iterator<String> itr=valueset.iterator();

	        Map<Integer,String> uniquemap=new HashMap<Integer,String>();

	        while (itr.hasNext()) 
		{
            		String value = itr.next();

		        for(Map.Entry<Integer,String> e:map.entrySet())
            		{                
				if(value.equals(e.getValue()) && !uniquemap.containsValue(value)) //  if the value doesnot contain in uniquemap then 
                		{
                    			uniquemap.put(e.getKey(), value);            		//put the key and value in unique map										                   
                		}

            		}

        	}

	        System.out.println("After removing duplicate values from map" +"\n");
        	
		System.out.println(uniquemap);


    }


}

