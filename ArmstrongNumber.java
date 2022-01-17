package com.logic;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void checkArmstrong(int number) {
		
		int cube = 0 , rem , temp;
		temp = number;
		
		while(number>0) {
			rem = number % 10;
			cube += (rem * rem * rem);
			number /= 10;
		}
		
		if(temp==cube) {
			System.out.println(temp+" is an armstrong number");
		}
		else {
			System.out.println(temp+" is not an amstrong number");	
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		int number = sc.nextInt();
		ArmstrongNumber.checkArmstrong(number);
		
		sc.close();
	}
}
