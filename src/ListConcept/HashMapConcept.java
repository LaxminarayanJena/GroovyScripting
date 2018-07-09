package ListConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		// HashMap is a class implements map interface
		//extends abstract map
		//it contains only unique elements
		//stores the value -key-value pair
		//it may have one null key and multiple null values
		//it maintains no order
		//hashmap is non synchronised(can be acceseed by multiple threads- not thread safe)
		//concurrent modification exception-fail -fast condition //simultaneoulsy getting updated value by one thread due to another thread
		
		
		HashMap<Integer,String>hm = new HashMap<Integer, String>();
		hm.put(1, "selenium");
		hm.put(2,"qtp");
		hm.put(3,"testComplete");
		hm.put(4, "sap");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(7));// null- no error
		
		for(Entry m:hm.entrySet())
		{
			System.out.println(m.getKey() +"-"+ m.getValue());
		}
		System.out.println(hm);//{1=selenium, 2=qtp, 3=testComplete, 4=sap}
		hm.remove(3);
		System.out.println(hm);//{1=selenium, 2=qtp, 4=sap}
		
HashMap<Integer, Employee> emp= new HashMap<Integer,Employee>();
Employee e1= new Employee("Tom",25,"admin");
Employee e2= new Employee("peter",26,"peon");
Employee e3= new Employee("raja",27,"clerk");

emp.put(1, e1);
emp.put(2,e2);
emp.put(3,e3);

//traverse the hashmap
for(Entry<Integer,Employee> m:emp.entrySet())
{
	int key=m.getKey();
	Employee e=m.getValue();
	System.out.println("employee " + key + " info: ");
	System.out.println(e.name + " "+ e.age +" "+ e.dept);
}



	}

}
