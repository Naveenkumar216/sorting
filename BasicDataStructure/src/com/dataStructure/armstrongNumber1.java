package com.dataStructure;

public class armstrongNumber1 {

	public static void main(String[] args) {
		for(int i=100;i<1000;i++) {
			 int n=i;
			 int rem,sum=0;
			 while(n>0) {
				   rem=n%10;
				   n=n/10;
				   sum=sum+rem*rem*rem;
			   }
			   if(i==sum) {
				   System.out.println(i+" is Armstrong Number");
			   }
		}
	}

}
