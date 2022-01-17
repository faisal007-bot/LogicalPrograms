package com.logic;

import java.util.Scanner;

public class GCD {
	public static void getGCD(int number1,int number2) {
		
		int gcd = 1;
		
		for(int i=1;i<=number1 && i<=number2;i++) {
			
			if(number1%i==0 && number2%i==0) {
				
				gcd = i;
			}
		}
		
		System.out.println("first number : "+number1+"\n"+"second number : "+number2);
		System.out.println("largest number that divides both the numbers completely = "+gcd);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number1");
		int number1 = sc.nextInt();
		
		System.out.println("enter the number2");
		int number2 = sc.nextInt();
		
		GCD.getGCD(number1,number2);
		
		sc.close();
	}
}
