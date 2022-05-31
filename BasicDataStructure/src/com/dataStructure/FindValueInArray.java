package com.dataStructure;

import java.util.Scanner;

public class FindValueInArray {

	public static void main(String[] args) {
		int a[]= new int[15];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Elements");
		int i;
		for( i=0;i<15;i++) {  
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the search");
		int n=sc.nextInt();
		for(i=0;i<15;i++) {
		if(n==a[i]) {
			System.out.println("Number is present in Array List");
			break;
		}
		}
		if(i==15){
			System.out.println("Not present in Array List");
		}
	}
}
