package com.logic;

import java.util.Scanner;

public class StringSubset {
	public static void subSet(String str) {
		
		int temp = 0;
		int length = str.length();
		String[] subSet = new String[length*(length+1)/2];
		
		for(int i=0;i<length;i++) {
			
			for(int j=i;j<length;j++) {
				
				subSet[temp] = str.substring(i, j+1);
				temp++;
			}
		}
		
		System.out.println("all possible subsets of the string = "+str);
		System.out.println("total subsets of the string are = "+temp);
		for(String s:subSet) {
			
			System.out.print(s+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the string");
		String str = sc.nextLine();
		
		StringSubset.subSet(str);
		
		sc.close();
	}
}
