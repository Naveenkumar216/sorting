package com.springcore.assignments;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Customer C = context.getBean("customer",Customer.class);
		Address temp = C.getAddress();
		System.out.println("CustomerName : "+C.getCustomerName()+"\nId : "+C.getCustomerId()+"\nMobileNumber : "+C.getCustomerContact());
		System.out.println("Street : "+temp.getStreet()+"\nState : "+temp.getState()+"\nCity : "+temp.getCity()+"\nCountry : "+temp.getCountry()
		+"\nZip : "+temp.getZip());
		
	}
}
