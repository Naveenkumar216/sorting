package Sorting;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        boolean prime= true;
        for(int i=2;i<a;i++) {
        if(a % i == 0) {
           prime= false;
           break;
           
        }
        }
        System.out.println(prime);
	}

}
