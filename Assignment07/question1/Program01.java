package com.sunbeam;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String string=sc.nextLine();
		String rString=reverseString(string);
		System.out.println("reversed String-"+rString);

	}
	
	public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        String result= sb.reverse().toString();
        //System.out.println(result);
        return result;
    }

}
