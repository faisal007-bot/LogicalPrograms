package com.logic;

import java.util.Scanner;

public class CheckPrimeNumber {
	public static void checkPrime(int number) {
		
		boolean isPrime = true;
		int range = number / 2;
		
		for(int i=2;i<=range;i++) {
			if(number%i==0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime) {
			System.out.println(number+" is a prime number");
		}
		else
			System.out.println(number+" is not a prime number");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		int number = sc.nextInt();
		
		CheckPrimeNumber.checkPrime(number);
		
		sc.close();
	}
}
