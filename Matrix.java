package com.logic;

public class Matrix {
	public static void ascendingMatrix(int[][] matrix) {
		
		System.out.println("printing matrix in ascending order");
		for(int i=0;i<matrix.length;i++) {
			
			for(int j=0;j<matrix[i].length;j++) {
				
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void descendingMatrix(int[][] matrix) {
		
		System.out.println("printing matrix in descendng order");
		for(int i=matrix.length-1;i>=0;i--) {
			
			for(int j=matrix[i].length-1;j>=0;j--) {
				
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		int[][] matrix = {{12,3,4},{67,64,3},{8,645,3},{67,54,12}};
		
		Matrix.ascendingMatrix(matrix);
		
		Matrix.descendingMatrix(matrix);
	}
}
