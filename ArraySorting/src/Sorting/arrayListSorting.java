package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class arrayListSorting {

	public static void main(String[] args) {
		ArrayList<employee> al = new ArrayList<employee>();
		al.add(new employee(1,"naveen"));
		al.add(new employee(2,"kumar"));
		al.add(new employee(3,"naidu"));
		al.add(new employee(4,"kurumeti"));
   
   Collections.sort(al, new Comparator<employee>() {

	@Override
	public int compare(employee o1, employee o2) {
				return o1.getEmpName().compareTo(o2.getEmpName());
	}
	   
   });
   for(employee emp : al) {
	   System.out.println(emp.getEmpId()+" "+emp.getEmpName());
   }
     System.out.println("sortimg by id");
   Collections.sort(al, (o1,o2)->(int)(o1.getEmpId()-(o2.getEmpId())));
   for(employee emp : al) {
	   System.out.println(emp.getEmpId()+" "+emp.getEmpName());
   }
 }
}
