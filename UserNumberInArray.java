package com.logic;

import java.util.Scanner;

public class UserNumberInArray {
	public static void checkNumberInArray(int[] arr,int number) {
		
		boolean isPresent = false;
		int index = 0;
		
		System.out.println("printing the array elements");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==number) {
				isPresent = true;
				index = i;
				break;
			}
		}
		
		if(isPresent) {
			System.out.println(number+" is present in the array at "+(index+1)+" position");
		}
		else
			System.out.println(number+" is not present in the array");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		int num = sc.nextInt();
		int[] arr = {12,434,3,23,4,2,134,56};
		
		UserNumberInArray.checkNumberInArray(arr, num);
		
		sc.close();
	}
}
