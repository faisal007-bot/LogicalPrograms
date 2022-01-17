package com.logic;

public class ArrayCopy {
	public static void copy1(int[] arr) {
		
		int[] copy = new int[arr.length];
		int index = 0;
		
		for(int i=0;i<arr.length;i++) {
			copy[index] = arr[i];
			index++;
		}
		
		System.out.println("printing the array copy using for loop");
		for(int i:copy) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

	public static void copy2(int[] arr) {
		
		int[] copy = new int[arr.length];
		int index = 0;
		
		while(index<arr.length) {
			copy[index] = arr[index];
			index++;
		}
		
		System.out.println("printing the array copy using while loop");
		for(int i:copy) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

	public static void copy3(int[] arr) {
		
		int[] copy = new int[arr.length];
		int index = 0;
		
		for(int i:arr) {
			copy[index] = i;
			index++;
		}
		
		System.out.println("printing the array copy using for-each loop");
		for(int i:copy) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

	public static void copy4(int[] arr) {
		
		int[] copy = new int[arr.length];
		
		copy = arr.clone();
		
		System.out.println("printing the array copy using clone method");
		for(int i:copy) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

	public static void copy5(int[] arr) {
		
		int[] copy = new int[arr.length];
		
		System.arraycopy(arr, 0, copy, 0, copy.length);
		
		System.out.println("printing the array copy using arraycopy method");
		for(int i:copy) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

	
	public static void main(String[] args) {
		
		int[] arr = {12,43,132,1232,67};
		
//		using for loop
		ArrayCopy.copy1(arr);
//		using while loop
		ArrayCopy.copy2(arr);
//		using for-each loop
		ArrayCopy.copy3(arr);
//		using clone method
		ArrayCopy.copy4(arr);
//		using system.arrayCopy method
		ArrayCopy.copy5(arr);
	}
}
