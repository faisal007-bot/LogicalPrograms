package com.logic;

import java.util.Scanner;

public class NumberOfInString {
	public static void numberOfWords(String str) {
		
		int count = 0;
		String[] arr = str.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			count++;
		}
		
		System.out.println("total number of words in the string = "+count);
	}
	
	public static void numberOfCharacters(String str) {
		
		int count = 0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println("total number of characters in the string = "+count);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the text");
		String text = sc.nextLine();
		
		NumberOfInString.numberOfWords(text);
		
		NumberOfInString.numberOfCharacters(text);
		
		sc.close();
	}
}
