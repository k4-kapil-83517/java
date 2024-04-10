package com.sunbeam;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		try 
		{
			System.out.println("Enter the String:");
			String input=sc.nextLine();
			System.out.println("Input String Length :"+input.length());
			
			if (input.length()>80) 
			{
				throw new ExceptionLineTooLong("The strings is too long");
			}
			
			System.out.println("Input String:"+input.toString());
			System.out.println("The Length of String:"+input.length());
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		sc.close();
	}

}
