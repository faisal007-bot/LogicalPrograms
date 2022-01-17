package com.logic;

import java.util.Scanner;

public class Pattern {
	public static void increasingPattern(int number,char symbol) {
		
		for(int i=1;i<=number;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(symbol);
			}
			
			System.out.println();
		}
	}

	public static void decreasingPattern(int number,char symbol) {
		
		for(int i=number;i>0;i--) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(symbol);
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		int num = sc.nextInt();
		
		System.out.println("enter the symbol");
		char symbol = sc.next().charAt(0);
		
		Pattern.increasingPattern(num, symbol);
		
		Pattern.decreasingPattern(num, symbol);
		
		sc.close();
	}
}
