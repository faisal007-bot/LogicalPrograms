package com.logic;

class ComplexNumber{
	
	int real,imaginary;
	
	public ComplexNumber() {
		
	}
	
	public ComplexNumber(int real,int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
}

public class SumOfComplexNumber {
	
	public static ComplexNumber sumOfComplexNumber(ComplexNumber c1,ComplexNumber c2) {
		
		ComplexNumber temp = new ComplexNumber(0, 0);
		temp.real = c1.real + c2.real;
		temp.imaginary = c1.imaginary + c2.imaginary;
		return temp;
	}
	public static void main(String[] args) {
		
		ComplexNumber c1 = new ComplexNumber(12, 34);
		ComplexNumber c2 = new ComplexNumber(45, 78);
		
		ComplexNumber complexSum = SumOfComplexNumber.sumOfComplexNumber(c1, c2);
		
		System.out.println("Sum of real number = "+complexSum.real);
		System.out.println("Sum of imaginary number = "+complexSum.imaginary);
	}
}
