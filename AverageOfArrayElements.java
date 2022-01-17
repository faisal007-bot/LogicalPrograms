package com.logic;

public class AverageOfArrayElements {
	public static void averageOfElements(int[] arr) {
		
		int sum = 0 , average;
		
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		average = sum / arr.length;
		
		System.out.println("the sum of array elements = "+sum);
		System.out.println("average of array elements = "+average);
	}
	
	public static void main(String[] args) {
		
		int[] arr = {12,3,342,2,4};
		
		AverageOfArrayElements.averageOfElements(arr);
	}
}
