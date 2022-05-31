package com.dataStructure;

import java.util.Scanner;

public class ThreeStudents {

	public static void main(String[] args) {
		int s1,s2,s3,total,avg;
		Scanner sc = new Scanner(System.in);
		  
		  System.out.println("Enter the number of students");
		  int n = sc.nextInt();
		  for(int i=1;i<=n;i++) {
			  System.out.println("Enter the marks for student : "+i);
			  System.out.println("Enter the subject 1 marks");
			  s1=sc.nextInt();
			  System.out.println("Enter the subject 2 marks");
			  s2=sc.nextInt();
			  System.out.println("Enter the subject 3 marks");
			  s3=sc.nextInt();
			  total = s1+s2+s3;
			  avg=total/3;
			  System.out.println("Total marks for student "+i+" = "+total);
			  System.out.println("avg marks for student "+i+" = "+avg);
			  
		  }

	}

}
