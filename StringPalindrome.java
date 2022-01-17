package com.logic;

import java.util.Scanner;

public class StringPalindrome {
	public static void palindromeString(String str) {
		boolean isPalindrome = true;
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
				
				isPalindrome = false;
				break;
			}
		}
		
		if(isPalindrome) {
			System.out.println(str+" is palindrome string");
		}
		else
			System.out.println(str+" is not palindrome string");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the string");
		String str = sc.nextLine();
		
		StringPalindrome.palindromeString(str);
		
		sc.close();
	}
}
