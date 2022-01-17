package com.logic;

public class MatrixOperations {
	public static void matrixSum(int[][] matrix1, int[][] matrix2) {
		
		int[][] sum = new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				sum[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		System.out.println("sum of matrix1 and matrix2 :::");
		for(int i[]:sum) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	public static void matrixSub(int[][] matrix1, int[][] matrix2) {
		int[][] sub = new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				sub[i][j] = matrix1[i][j] - matrix2[i][j];
			}
		}
		System.out.println("substraction of matrix1 and matrix2 :::");
		for(int i[]:sub) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	public static void matrixProduct(int[][] matrix1, int[][] matrix2) {
		int[][] product = new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				product[i][j] = matrix1[i][j] * matrix2[i][j];
			}
		}
		System.out.println("product of matrix1 and matrix2 :::");
		for(int i[]:product) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	public static void matrixDivision(int[][] matrix1, int[][] matrix2) {
		int[][] division = new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				division[i][j] = matrix1[i][j] / matrix2[i][j];
			}
		}
		System.out.println("division of matrix1 and matrix2 :::");
		for(int i[]:division) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	public static void matrixMod(int[][] matrix1, int[][] matrix2) {
		int[][] mod = new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				mod[i][j] = matrix1[i][j] % matrix2[i][j];
			}
		}
		System.out.println("mod of matrix1 and matrix2 :::");
		for(int i[]:mod) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		int[][] matrix1 = {{11,22,33},{44,55,66},{77,88,99}};
		int[][] matrix2 = {{1,2,3},{4,5,6},{7,8,9}};
		
		MatrixOperations.matrixSum(matrix1, matrix2);
		
		MatrixOperations.matrixSub(matrix1, matrix2);
		
		MatrixOperations.matrixProduct(matrix1, matrix2);
		
		MatrixOperations.matrixDivision(matrix1, matrix2);
		
		MatrixOperations.matrixMod(matrix1, matrix2);
		
	}
}
