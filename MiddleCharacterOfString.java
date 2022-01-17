package com.logic;

import java.util.Scanner;

public class MiddleCharacterOfString {
	public static void checkMiddleCharacter(String str) {
		
		int length , position;
		String midCharacter = null;
		
		for(int i=0;i<str.length();i++) {
			
			if(str.length()%2==0) {
				position = str.length()/2-1;
				length = 2;
			}
			else {
				
				position = str.length()/2;
				length = 1;
			}
			
			midCharacter = str.substring(position,position+length);
		}
		
		System.out.println("middle character of the string = "+midCharacter);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the text");
		String text = sc.nextLine();
		MiddleCharacterOfString.checkMiddleCharacter(text);
		
		sc.close();
	}
}
