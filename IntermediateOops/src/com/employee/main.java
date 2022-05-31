package com.employee;

public class main {

	public static void main(String[] args) {
		manager mg=new manager();
		labor l=new labor();
		mg.setIncentive(3000);
		mg.total_salary();
		l.setOver_time(2500);
		l.total_salary();

	}

}
