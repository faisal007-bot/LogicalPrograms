package com.logic;

import java.util.Scanner;

public class SumOfDigits {
	public static void sum(int number) {
		int temp , rem , sum = 0;
		
		temp = number;
		
		while(number>0) {
			rem = number % 10;
			sum += rem;
			number /= 10;
		}
		
		System.out.println("sum of idividual digits of the "+temp+" = "+sum);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		int num = sc.nextInt();
		SumOfDigits.sum(num);
		
		sc.close();
	}
}
