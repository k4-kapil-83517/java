package com.sunbeam;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter String");
		String string=sc.nextLine();
		String rString=reverseString(string);
		System.out.println("Reverse- "+rString);
		if(string.equals(rString)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}

	}

	private static String reverseString(String string) {
		StringBuilder sb= new StringBuilder(string);
		String result = sb.reverse().toString();
		return result;
	}

}
