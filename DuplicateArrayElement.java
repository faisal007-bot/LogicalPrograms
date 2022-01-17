package com.logic;

public class DuplicateArrayElement {

	public static void checkDuplicate(int[] arr) {

		System.out.println("duplicate elements in the array");
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			
			count = 1;
			
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {

					count++;

					if (count == 2) {
						
						System.out.print(arr[j] + " ");
					}

				}
			}
		}

	}

	public static void main(String[] args) {

		int[] arr = { 12, 23, 1, 22, 12, 12, 23, 1, 2, 4, 2, 4, 67 };

		DuplicateArrayElement.checkDuplicate(arr);
	}
}
