package com.logic;

import java.util.Random;
import java.util.Scanner;

public class RandomArray {
	public static void print(int[] arr) {
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[20];
		
		for(int i=0;i<array.length;i++) {
			array[i] = new Random().nextInt(100);
		}
		
		RandomArray.print(array);
		
		sc.close();
	}
}
