package com.logic;

public class ArrayIsSorted {
	public static void checkArray(int[] arr) {
		
		boolean isSorted = true;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					isSorted = false;
					break;
				}
			}
		}
		
		System.out.println("printing the array");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		if(isSorted) {
			System.out.println("array is sorted");
		}
		else
			System.out.println("array is not sorted");
	}
	public static void main(String[] args) {
		
		int[] arr = new int[] {3,3,25454,37,34,821};
		ArrayIsSorted.checkArray(arr);
	}
}
