package com.logic;

import java.util.Scanner;

public class EvenOddRange {
	public static void evenNumbers(int range) {
		System.out.println("even numbers between 0 to "+range+":");
		for(int i=0;i<=range;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	
	public static void oddNumbers(int range) {
		System.out.println("odd numbers between 0 to "+range+":");
		for(int i=0;i<=range;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the max range");
		int range = sc.nextInt();
		
		EvenOddRange.evenNumbers(range);
		
		EvenOddRange.oddNumbers(range);
		
		sc.close();
	}
}
