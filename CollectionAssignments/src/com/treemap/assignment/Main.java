package com.treemap.assignment;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		TreeMap<Long, Contact> tm = new TreeMap<>();
		Contact c = new Contact(998,"naveen","na@gmail.com","male");
		Contact c1 = new Contact(997,"shiva","shi@gmail.com","male");
		Contact c2 = new Contact(996,"prasad","pad@gmail.com","male");
		Contact c3 = new Contact(995,"kumar","ku@gmail.com","male");
		
		tm.put((long) 998, c);
		tm.put((long) 997,c1);
		tm.put((long) 996,c2);
		tm.put((long) 995,c3);
		
		Set keys = tm.keySet();
		System.out.println(keys);
		
		Collection<Contact> values = tm.values();
		System.out.println(values);
		
		Set<Map.Entry<Long, Contact>> entries = tm.entrySet();
		System.out.println(entries);

	}

}
