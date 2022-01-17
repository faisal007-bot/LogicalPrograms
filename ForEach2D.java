package com.logic;

import java.util.Scanner;

public class ForEach2D {
	public static void print(int[][] arr) {
		
		for(int out[]:arr) {
			
			for(int in:out) {
				
				System.out.print(in+" ");
			}
			
			System.out.println("\n"+"---------------------------");
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] array = new int[][] {{12,32,1},{4,53,44},{5,6,8}};
		ForEach2D.print(array);
		
		sc.close();
	}
}
