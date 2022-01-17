package com.logic;

import java.util.Scanner;

public class PrimeRange {
	public static void primeNumbers(int range) {
		
		boolean isPrime = true;
		
		for(int i=3;i<=range;i++) {
			isPrime = true;
			for(int j=4;j<i;j++) {
				if(i%j==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.print(i+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the maximum range");
		int range = sc.nextInt();
		
		PrimeRange.primeNumbers(range);
		
		sc.close();
	}
}
