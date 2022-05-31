package com.exceptionhandling.assignments;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value a : ");
		a=sc.nextInt();
		System.out.println("Enter the value b : ");
		b= sc.nextInt();
		try {
			int c= a/b;
			System.out.println("Result"+c);
		}
		catch(ArithmeticException e) {
			System.out.println ("Can't be divided by Zero " + e);
		}

	}

}
