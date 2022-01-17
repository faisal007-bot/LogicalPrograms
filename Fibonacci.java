package com.logic;

import java.util.Scanner;

public class Fibonacci {
	public static void fibonacciNumbers(int range) {
		
		int n1 = 0 , n2 = 1 , n3;
		System.out.print(n1+" "+n2+" ");
		
		for(int i=2;i<range;i++) {
			
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			
			System.out.print(n3+" ");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the range");
		int range = sc.nextInt();
		
		Fibonacci.fibonacciNumbers(range);
		
		sc.close();
	}
}
