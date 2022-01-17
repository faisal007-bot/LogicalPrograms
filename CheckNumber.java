package com.logic;

import java.util.Scanner;

public class CheckNumber {
	
	public static void checkNumber(int number) {
		
		if(number>0) {
			
			System.out.println(number+" is positive");
		}
		else if(number<0) {
			
			System.out.println(number+" is negative");
		}
		else
			System.out.println(number+" is neither positive nor negative");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		int num = sc.nextInt();
		
		CheckNumber.checkNumber(num);
		
		sc.close();
	}
}
