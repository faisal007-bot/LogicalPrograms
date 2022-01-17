package com.logic;

import java.util.Scanner;

public class ReverseNumber {
	public static void reverseNumber(int number) {
		
		int rem , rev = 0, temp;
		temp = number;
		
		while(number>0) {
			
			rem = number % 10;
			rev = rev * 10 + rem;
			number /= 10;
		}
		
		System.out.println("original number = "+temp);
		System.out.println("reversed number = "+rev);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		int num = sc.nextInt();
		
		ReverseNumber.reverseNumber(num);
		
		sc.close();
	}
}
