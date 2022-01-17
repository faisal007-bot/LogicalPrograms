package com.logic;

import java.util.Scanner;

public class Calculator {
	public static void calculator(int num1, int num2, char operator) {
		
		switch (operator) {
		
			case '+':
				int sum = num1 + num2;
				System.out.println("the sum of " + num1 + " + " + num2 + " = " + sum);
				break;
				
			case '-':
				int sub = num1 - num2;
				System.out.println("the sum of " + num1 + " - " + num2 + " = " + sub);
				break;
				
			case '*':
				int product = num1 * num2;
				System.out.println("the sum of " + num1 + " * " + num2 + " = " + product);
				break;
				
			case '/':
				int division = num1 / num2;
				System.out.println("the sum of " + num1 + " / " + num2 + " = " + division);
				break;
				
			case '%':
				int modulus = num1 % num2;
				System.out.println("the sum of " + num1 + " % " + num2 + " = " + modulus);
				break;
				
			default:
				System.out.println("operator is invalid = "+operator);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the 1st number");
		int num1 = sc.nextInt();
		System.out.println("enter the 2nd number");
		int num2 = sc.nextInt();
		System.out.println("enter the operator + | - | * | / | %");
		char operator = sc.next().charAt(0);

		Calculator.calculator(num1, num2, operator);
		
		sc.close();
	}
}
