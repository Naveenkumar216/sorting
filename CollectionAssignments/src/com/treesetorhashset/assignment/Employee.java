package com.treesetorhashset.assignment;

public class Employee{
    private int Id;
    private String Name;
    private String Department;
    private int salary;
    // constructor to the fields
     public Employee(int id, String name, String department, int salary) {
		super();
		Id = id;
		Name = name;
		Department = department;
		this.salary = salary;
	}
     //default constructor
     public Employee() {
    	 
     }
	// setter and getter for id ,name,department,salary
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	//tostring() methods
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + ", Department=" + Department + ", salary=" + salary + "]";
	}
	
       
}
