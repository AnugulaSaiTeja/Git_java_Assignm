package com.CollectionsJava;

import java.util.LinkedList;

public class LL {
	public static void main(String args[])
	{
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Name");
		ll.addFirst("My");
		ll.addLast("Peter");
		ll.add(2, "is");
		System.out.println(ll);
		System.out.println(ll.get(2));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.indexOf("Name"));
		System.out.println(ll.lastIndexOf("My"));
		ll.removeFirst();
		ll.removeLast();
		System.out.println("The size of the list after removing two elements isis "+ll.size());
		ll.set(1, "Hemsberg");
		System.out.println("List after adding hemsberg is "+ll);
		System.out.println(ll.contains("Peter"));
		ll.remove(0);
		ll.remove(0);
		if(ll.isEmpty())
			System.out.println("List is empty");
		
		
		
		
	}

}
