package com.dataStructure;

import java.util.Scanner;

public class armstrongNumber {

	public static void main(String[] args) {
		int n,temp,rem,sum=0;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number");
		  n=sc.nextInt();
		   temp=n;
		   while(n>0) {
			   rem=n%10;
			   n=n/10;
			   sum=sum+rem*rem*rem;
		   }
		   if(temp==sum) {
			   System.out.println("It is Armstrong Number");
		   }
		   else {
			   System.out.println("It is not a Armstrong Number");
		   }
	}

}
