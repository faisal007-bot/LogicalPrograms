package com.logic;

public class SumOfArray {
	public static void sum(int[] arr) {
		
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		
		System.out.println("array elemets");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("the sum of array elements = "+sum);
	}
	public static void main(String[] args) {
		
		int[] arr = {12,234,2,322,7};
		SumOfArray.sum(arr);
	}
}
