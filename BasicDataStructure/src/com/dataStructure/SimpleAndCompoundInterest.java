package com.dataStructure;

import java.util.Scanner;

public class SimpleAndCompoundInterest {

	public static void main(String[] args) {
		double amount, rate, t, sim,com;
	    Scanner sc=new Scanner (System. in);
	    System.out.println("Enter the amount:");
	   amount=sc.nextDouble();
	    System. out. println("Enter the No.of years:");
	    t=sc.nextDouble();
	    System. out. println("Enter the Rate of  interest");
	    rate=sc.nextDouble();
	    sim=(amount * t * rate)/100;
	    com=amount * Math.pow(1.0+rate/100.0,t);
	    System.out.println("Simple Interest="+sim);
	    System.out. println("Compound Interest="+com);
	   }

	}

