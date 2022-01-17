package com.logic;

import java.util.Scanner;

public class DuplicateWords {
	public static void duplicateWords(String str) {
		
		String[] arr = str.split(" ");
		int count = 0;
		
		for(int i=0;i<arr.length;i++) {
			
			count = 1;
			
			for(int j=i+1;j<arr.length;j++) {
				
				count++;
				
				if(arr[i].equals(arr[j])&&arr[i]!=" ") {
					
					arr[j]="0";
				}
			}
			if(count>1&&arr[i]!="0") {
				
				System.out.print(arr[i]+" ");
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the string");
		String text = sc.nextLine();
		DuplicateWords.duplicateWords(text);
		
		sc.close();
	}
}
