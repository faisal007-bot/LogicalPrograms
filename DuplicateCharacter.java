package com.logic;

import java.util.Scanner;

public class DuplicateCharacter {
	public static void duplicateCharacters(String str) {
		
		char[] arr = str.toCharArray();
		int count = 0;
		
		for(int i=0;i<arr.length;i++) {
			
			count = 1;
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]&&arr[i]!=' ') {
					
					count++;
					arr[j] = '0';
				}
			}
			
			if(count>1&&arr[i]!='0') {
				System.out.print(arr[i]+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the string");
		String str = sc.nextLine();
		DuplicateCharacter.duplicateCharacters(str);
		
		sc.close();
	}
}
