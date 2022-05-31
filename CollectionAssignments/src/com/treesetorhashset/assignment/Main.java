package com.treesetorhashset.assignment;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;


public class Main {
	public static void main(String[] args) {
		TreeSet<Employee> em = new TreeSet<>();
		 em.add(new Employee(1,"naveen","CSD",20000));
		 em.add(new Employee(2,"kumar","NA",21000));
		 em.add(new Employee(3,"raj","AWS",22000));
		 em.add(new Employee(4,"shiva","DXC",23000));
		 em.add(new Employee(5,"prasad","M",24000));
		 em.add(new Employee(6,"santosh","AC",25000));
		 
		 Collections.sort(TreeSet<Employee> em,new Comparator<Employee>() {

			 @Override
				public int compare(Employee o1, Employee o2) {
							return o1.getName().compareTo(o2.getName());
				}
				   
			 
		 });
		 
		 for(Employee emp :em) {
			   System.out.println(emp.getName());
		   }
	       
	}

}
