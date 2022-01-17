package com.logic;

import java.util.Scanner;

public class Factorial {
//	factorial using recursive method
	public static int factorial(int number) {
		
		if(number==0 || number==1) {
			
			return 1;
		}
		
		return number*factorial(number-1);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		int number = sc.nextInt();
		int factorial = Factorial.factorial(number);
		System.out.println("factorial of "+number+" = "+factorial);
		
//		factorial using for loop
		int fact = 1;
		for(int i=1;i<=number;i++) {
			fact *= i;
		}
		System.out.println("factorial of "+number+" = "+fact);
		
		sc.close();
	}
}
