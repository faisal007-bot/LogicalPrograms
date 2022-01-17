package com.logic;

import java.util.Scanner;

public class Sum {
	public static void sumArray(int[] arr) {
		
		int sum = 0;
		
		System.out.println("array elements ::");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		System.out.println("sum of array elements = "+sum);
	}
	
	public static void sumOfRange(int begin,int end) {
		
		int sum = 0;
		
		for(int i=begin;i<=end;i++) {
			sum += i;
		}
		System.out.println("sum of numbers from "+begin+" to "+end+" = "+sum);
	}
	
	public static void sumOdd(int begin,int end) {
		
		int sum = 0;
		for(int i=begin;i<=end;i++) {
			if(i%2!=0) {
				sum += i;
			}
		}
		System.out.println("sum of odd numbers from "+begin+" to "+end+" = "+sum);
	}
	
	public static void sumEven(int begin,int end) {
		
		int sum = 0;
		for(int i=begin;i<=end;i++) {
			if(i%2==0) {
				sum += i;
			}
		}
		System.out.println("sum of even numbers from "+begin+" to "+end+" = "+sum);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {11,3,23,45,23,42};
		
		System.out.println("enter the begin range");
		int begin = sc.nextInt();
		
		System.out.println("enter the end range");
		int end = sc.nextInt();
		
		Sum.sumArray(arr);
		
		Sum.sumOfRange(begin, end);
		
		Sum.sumEven(begin, end);
		
		Sum.sumOdd(begin, end);
		
		sc.close();
	}
}
