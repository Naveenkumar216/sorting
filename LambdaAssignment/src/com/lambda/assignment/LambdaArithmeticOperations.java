package com.lambda.assignment;
@FunctionalInterface
interface Arithmetic{
	int operation(int a,int b);
}

public class LambdaArithmeticOperations {

	public static void main(String[] args) {
		//addition
		Arithmetic addition = (a,b) ->(a+b);
		System.out.println("Addition : "+addition.operation(3 , 2));
		
		//subtraction
		Arithmetic subtraction = (a,b) ->(a-b);
		System.out.println("Subtraction : "+subtraction.operation(3,2));
		
		//division
		Arithmetic division = (a,b) ->(a/b);
		System.out.println("Division : "+division.operation(10,5));
		
		//multiplication
		Arithmetic multiplication = (a,b) ->(a*b);
		System.out.println("Multiplication : "+multiplication.operation(2, 3));

	}
}
