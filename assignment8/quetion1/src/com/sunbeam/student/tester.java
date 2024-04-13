package com.sunbeam.student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class studentcity implements Comparator<student>
{

	@Override
	public int compare(student o1, student o2)
	{
		
		return o1.getCity().compareTo(o2.getCity());
	}
	public static Comparator<student> sortcity() 
	{
		Comparator<student> s1=new studentcity();
		return s1;
	}
	
}
class studentmarks implements Comparator<student>
{

	@Override
	public int compare(student o1, student o2)
	{
		
		return Double.compare(o2.getMarks(), o1.getMarks());
	}
	public static Comparator<student> sortmarks() 
	{
		Comparator<student> s1=new studentmarks();
		return s1;
	}
	
}
class studentnames implements Comparator<student>
{

	@Override
	public int compare(student o1, student o2)
	{
		
		return o1.getName().compareTo(o2.getName());
	}
	public static Comparator<student> sortnames() 
	{
		Comparator<student> s1=new studentnames();
		return s1;
	}
	
}


public class tester 
{

	public static void main(String[] args)
	{
		int choice;
		Scanner sc= new Scanner(System.in);
		student s[]=new student[5];
		s[0]=new student(2,"avdhut","kadegaon",40);
		s[1]=new student(1,"sachin","marathwada",80);
		s[2]=new student(4,"virat","bengluru",70);
		s[3]=new student(5,"dhoni","chennai",50);
		s[4]=new student(3,"rohit","mumbai",90);
		

		do
		{
			System.out.println("1. sorted on their city (asc)	2. sorted on their on marks (desc)  3. sorted on their on name (asc)	4.sort on rollno");
		
			System.out.print("enter choice");
			choice=sc.nextInt();
			switch (choice)
			{
			
			case 0:
				System.out.println("thanks");
				break;
			
			case 1:
			{
				System.out.println("Before sorting");
				for(student stu:s)
				{
					System.out.println(stu);
				}
				
				Arrays.<student>sort(s, studentcity.sortcity());
				
				System.out.println("After sorting on city(asc)");
				
				for(student stu:s)
				{
					System.out.println(stu);
				}
				
			}
				break;
				
			case 2:
			{
				System.out.println("Before sorting");
				for(student stu:s)
				{
					System.out.println(stu);
				}
				Arrays.<student>sort(s, studentmarks.sortmarks());
				System.out.println("After sorting on marks in descending order");
				
				for(student stu:s)
				{
					System.out.println(stu);
				}
				
			}
				break;
	
	
			case 3:
			{
				System.out.println("Before sorting");
				for(student stu:s)
				{
					System.out.println(stu);
				}
				
				Arrays.<student>sort(s, studentnames.sortnames());
				
				System.out.println("After sorting on marks(asc)");
				
				for(student stu:s)
				{
					System.out.println(stu);
				}
			}
				break;
			
			case 4:
			{
				System.out.println("Before sorting");
				for(student stu:s)
				{
					System.out.println(stu);
				}
				
				Arrays.sort(s);
				
				System.out.println("After sorting on roll number(asc)");
				for(student stu:s)
				{
					System.out.println(stu);
				}
			}
				break;
				
			default:
				System.out.println("enter a valid choice");
				break;
			}
			
		}while(choice!=0);
		
	
		
		
	}

}
