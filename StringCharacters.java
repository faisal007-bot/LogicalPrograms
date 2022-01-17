package com.logic;

public class StringCharacters {
	public static void stringCharacters(String str) {

		str = str.toLowerCase();
		int vowelCount = 0 , consonantCount = 0 , numbersCount = 0 , specialCount = 0;
		
		System.out.println("vowels in the string are :: ");
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e'
					|| str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				System.out.print(str.charAt(i)+" ");
				vowelCount++;
			}
		}
		System.out.println();
		System.out.println("total vowels in the string = "+vowelCount);
		
		System.out.println("consonants in the string are :: ");
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				System.out.print(str.charAt(i)+" ");
				consonantCount++;
			}
		}
		System.out.println();
		System.out.println("total consonants in the string = "+consonantCount);
		
		System.out.println("numbers in the string = ");
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				System.out.print(str.charAt(i)+" ");
				numbersCount++;
			}
		}
		System.out.println();
		System.out.println("total numbers in the string = "+numbersCount);
		
		System.out.println("special characters in the string = "+vowelCount);
		for(int i=0;i<str.length();i++) {
			if(!(str.charAt(i)>='a' && str.charAt(i)<='z'
		            || str.charAt(i)>='0' && str.charAt(i)<='9' || str.charAt(i)==' '))
			 {
				System.out.print(str.charAt(i)+" ");
				specialCount++;
			}
		}
		System.out.println();
		System.out.println("total number of special characters in the string = "+specialCount);
	}

	public static void main(String[] args) {

		String str = "3489%*^*( dkklsdUfasiasler";
		StringCharacters.stringCharacters(str);
	}
}
