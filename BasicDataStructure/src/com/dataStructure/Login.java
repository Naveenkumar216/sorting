package com.dataStructure;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
           for(int i=1;i<=3;i++) {
        	   System.out.println("Enter the Login Name");
        	   String loginName =sc.nextLine();
        	   System.out.println("Enter the Password");
        	   String password =sc.nextLine();
        	 if((loginName.equals("Naveen"))&&(password.equals("Kumar123"))) {
        		 System.out.println("welcome");
        		  break;
        	 }
        	 if(i==3) {
        		 System.out.println("contact admin");
        	 }
           }         
	}

}
