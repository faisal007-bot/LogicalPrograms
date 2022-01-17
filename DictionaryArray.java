package com.logic;

public class DictionaryArray {
	public static void dictionaryOrder(String[] arr) {
		
		System.out.println("printing the array in original order");
		for(String s:arr) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i].compareTo(arr[j])>0) {
					
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("printing array in dictionary order");
		for(String s:arr) {
			System.out.print(s+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		String[] arr = {"java","python","c++","c#","fortran","kotlin","assembly","swift","php"};
		
		DictionaryArray.dictionaryOrder(arr);
	}
}
