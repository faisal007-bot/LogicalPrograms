package com.logic;

public class LargestSmallestElement {
	public static void largestElement(int[] arr) {
		
		int largest = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>largest) {
				largest = arr[i];
			}
		}
		
		System.out.println("the largest element in the array = "+largest);
	}
	
	public static void smallestElement(int[] arr) {
		
		int smallest = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<smallest) {
				smallest = arr[i];
			}
		}
		
		System.out.println("the smallest element in the array = "+smallest);
	}
	
	public static void main(String[] args) {
		
		int[] arr = {12,43,32,3,21,3,213,2,74,345,2};
		
		LargestSmallestElement.smallestElement(arr);
		
		LargestSmallestElement.largestElement(arr);
	}
}
