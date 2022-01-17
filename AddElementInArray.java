package com.logic;

import java.util.Scanner;

public class AddElementInArray {
	public static void addElementInArray(int[] arr,int index,int value) {
		
		System.out.println("printing the original array");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int i=arr.length-1;i>index;i--) {
			arr[i] = arr[i-1];
		}
		arr[index] = value;
		
		System.out.println("after adding the users element at the "+arr[index]);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the index of the array");
		int index = sc.nextInt();
		System.out.println("enter the value you want to insert");
		int value = sc.nextInt();
		int[] arr = {23,4,3,2,343,23,12343,33};
		
		AddElementInArray.addElementInArray(arr, index,value);
		
		sc.close();
	}
}
