package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {
	//linked list implements list and deque interface

	public static void main(String[] args) {
		LinkedList<String> ll= new LinkedList<String>();
		ll.add("test");
		ll.add("qtp");
		ll.add("selenium");
		ll.add("RPA");
		System.out.println("content of linked list" + ll);
		ll.addFirst("java");
		ll.addLast("physics");
		System.out.println("content of linked list" + ll);
		
		System.out.println(ll.get(0));
		ll.set(0, "chem");
		
		System.out.println(ll.get(0));
		ll.removeFirst();
		ll.removeLast();
		System.out.println("content of linked list" + ll);
		ll.remove(2);
		System.out.println("content of linked list" + ll);
		
		
		//print all values of linked list
		System.out.println("---for loop----");
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		System.out.println("---advance for loop----");
		
		for(String str:ll)
		{
			System.out.println(str);
		}
		System.out.println("---iterator----");
		{
			Iterator<String> it=ll.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			
		}
		System.out.println("---while loop----");
		int i=0;
		while(ll.size()>i)
		{
			System.out.println(ll.get(i));
			i++;
		}
		}
	}


