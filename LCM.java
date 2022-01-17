package com.logic;

import java.util.Scanner;

public class LCM {
	public static void checkLCM(int n1,int n2) {
		
		int gcd = 1;
		
		for(int i=1;i<=n1 && i<=n2;i++) {
			
			if(n1%i==0 && n2%i==0) {
				
				gcd = i;
			}
		}
		
		int lcm = (n1 *n2)/gcd;
		
		System.out.println("first number : "+n1);
		System.out.println("first number : "+n2);
		System.out.println("the largest number that divides both the numbers completely = "+gcd);
		System.out.println("the LCM of n1 and n2 = "+lcm);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number 1");
		int n1 = sc.nextInt();
		
		System.out.println("enter the number 2");
		int n2 = sc.nextInt();
		
		LCM.checkLCM(n1, n2);
		
		sc.close();
	}
}
