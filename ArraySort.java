package com.logic;

public class ArraySort {
	public static void ascendingorder(int[] arr) {
		System.out.println("printing the array in original order");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("printing the array after sorting in ascending order");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void descendingOrder(int[] arr) {
		System.out.println("printing the array in original order");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("printing the array after sorting in descending order");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int[] arr = {12,42,4532,3,45,3,215476,56};
		
//		ascending order
		ArraySort.ascendingorder(arr);
//		descending order
		ArraySort.descendingOrder(arr);
	}
}
