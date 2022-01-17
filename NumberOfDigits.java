package com.logic;

import java.util.Scanner;

public class NumberOfDigits {
	@SuppressWarnings("unused")
	public static void numberOfDigits(int number) {
		
		int temp = number , count = 0;
		
		while(number>0) {
			int rem = number % 10 ; 
			number /= 10;
			count++;
		}
		System.out.println("the number  = "+temp);
		System.out.println("it contains "+count+" digits");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		int num = sc.nextInt();
		
		NumberOfDigits.numberOfDigits(num);
		
		sc.close();
	}
}
