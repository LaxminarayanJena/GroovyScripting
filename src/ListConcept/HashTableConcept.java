package ListConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		//it is similar to hashmmap but it is synchronised
		// stores the value on the basis of key and value
		//key-object- hashcode- value
      	Hashtable h1= new Hashtable();
      	h1.put(1, "tom");
      	h1.put(2, "mouse");
      	h1.put(3, "fan");
      	

      	//create a clone copy/shallow copy
      	Hashtable h2= new Hashtable();
      	h2=(Hashtable)h1.clone();
      	System.out.println("the values from h1" + h1);
      	System.out.println("the values from h2" + h2);
      	
      	h1.clear();
      	System.out.println("the values from h1" + h1);
      	System.out.println("the values from h2" + h2);	
      	
      	//contains value
      	Hashtable st= new Hashtable();
      	st.put("A", "ram");
      	st.put("B", "MANAGER");
      	st.put("C", "QTP");
      	
      	if(st.contains("naveen"))
      	{
      		System.out.println("value is found");
      	}
      	
      	//print all the values from hashtable using enumeration- elements
      	
      	Enumeration e=st.elements();
      	System.out.println("print values from st using enumeration");
      	while(e.hasMoreElements())
      	{
      		System.out.println(e.nextElement());
      	}
      	
      	//get all the values from hastable using entry set()--set of hashtables
      	System.out.println("print values from st using entry set");
      	st.entrySet();
      	Set s= st.entrySet();
      	System.out.println(s);
      	
     	Hashtable<String,String> st1= new Hashtable<String,String>();
      	st1.put("A", "ram");
      	st1.put("B", "MANAGER");
      	st1.put("C", "QTP");
      	st1.put("C", "QTP");//will print only one time qtp
      	//st1.put(null, "Selenium");
      	//st1.put("D", null);
      	//it contains only unique values
      	//no null key and values
      	
      	System.out.println("values from st1");
      	System.out.println(st1);
      	//check both hastables are equal or not
      	if(st.equals(st1))
      	{
      		System.out.println("both are equal");
      	}
      	
      	//get the value from a key
      	System.out.println(st1.get("A"));
      	
      	//get the hashcode of hashtable object
      	
      	System.out.println("hashcode value of st1->" + st1.hashCode());
      	
      	
	}
	
	

}
