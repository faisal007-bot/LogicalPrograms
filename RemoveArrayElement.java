package com.logic;

import java.util.Scanner;

public class RemoveArrayElement {
	public static void removeArrayElement(int[] arr,int index) {
		
		int[] newArray = new int[arr.length-1];
		
		if(index<0||index>=arr.length||arr==null) {
			for(int i:arr) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		
		for(int i=0,j=0;i<arr.length;i++) {
			if(i==index) {
				continue;
			}
			newArray[j] = arr[i];
			j++;
		}
		
		
		System.out.println("original array elements");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		
		System.out.println();
		System.out.println("you have entered the index = "+index);
		System.out.println("element present at that index = "+arr[index]);
		System.out.println("after removing the element = "+arr[index]);
		
		for(int i:newArray) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {12,2,22,4,45,12,46,5,2};
		System.out.println("enter the index number");
		int index = sc.nextInt();
		RemoveArrayElement.removeArrayElement(arr, index);
		
		sc.close();
	}
}
