package com.logic;

import java.util.Scanner;

public class Palindrome {
	public static void palindrome(int number) {
		int rev = 0 , rem , temp;
		temp = number;
		while(number>0) {
			rem = number % 10 ; 
			rev = rev * 10 + rem;
			number /= 10;
		}
		if(temp==rev) {
			System.out.println(temp+" is a palindrome number");
		}
		else
			System.out.println(temp+" is not a palindrome number");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		int num = sc.nextInt();
		
		Palindrome.palindrome(num);
		
		sc.close();
	}
}
