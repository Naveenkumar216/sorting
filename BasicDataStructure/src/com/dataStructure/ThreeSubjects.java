package com.dataStructure;

import java.util.Scanner;

public class ThreeSubjects {

	public static void main(String[] args) {
		int s1,s2,s3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the subject 1 marks:");
        s1=sc.nextInt();
        System.out.println("Enter the subject 2 marks:");
        s2=sc.nextInt();
        System.out.println("Enter the subject 3 marks :");
        s3=sc.nextInt();
        if((s1>=0&&s1<=100)&&(s2>=0&&s2<=100)&&
        		(s3>=0&&s3<=100)) {
        	if((s1>=60) && (s2>=60) && (s3>=60)) {
        		System.out.println("passed");
        	}
        	 else if((s1>=60&&s2>=60&&s3<=60)||(s1>=60&&s2>=60&&s3>=60)
        			||(s1<=60&&s2>=60&&s3>=60)) {
        		System.out.println("promoted");
        	 }
        	else if((s1>=60&&s2<=60&&s3<=60)||(s1<=60&&s2>=60&&s3<=60)
        			||(s1<=60&&s2<=60&&s3>=60)||(s1<=60&&s2<=60&&s3<=60)) {
        			System.out.println("failed");
        		}
        }
        else {System.out.println("failed");}
        
	}

}
