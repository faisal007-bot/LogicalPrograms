package com.logic;

public class ArrayOddEven {
	public static void Array(int[] arr) {
		
		System.out.println("printing the elements present at the even position");
		
		for(int i=1;i<arr.length;i=i+2) {
			
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("printing the elements present at the odd position");
		
		for(int i=0;i<arr.length;i=i+2) {
			
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int[] arr = {12,32,32,458,43,23,43,265,9,31,6};
		
		ArrayOddEven.Array(arr);
	}
}
