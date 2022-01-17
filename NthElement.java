package com.logic;

import java.util.Scanner;

public class NthElement {
	public static void nthSmallestNumber(int[] arr, int number) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("array elements in the ascending order");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("the " + number + " smallest number in the array is = " + arr[number-1]);
	}

	public static void nthLargestNumber(int[] arr, int number) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] < arr[j]) {

					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("array elements in the descending order");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("the " + number + " largest number in the array is = " + arr[number-1]);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = { 111, 43, 212, 1, 2, 4312, 3, 134 };

		System.out.println("enter the nth largest number");
		int largest = sc.nextInt();

		System.out.println("enter the nth smallest number");
		int smallest = sc.nextInt();

		NthElement.nthSmallestNumber(arr, smallest);
		NthElement.nthLargestNumber(arr, largest);

		sc.close();
	}
}
