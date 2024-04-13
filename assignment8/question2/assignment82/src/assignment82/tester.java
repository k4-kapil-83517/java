package assignment82;

import java.util.Comparator;
import java.util.Scanner;



public class tester 
{
    public static <T> void sort(T[] arr,Comparator<? super T>c) 
    {
    	for(int i=0;i<arr.length;i++)
    	{
    		for(int j=i+1;j<arr.length;j++)
    		{
    			if(c.compare(arr[i], arr[j])>0)
    			{
    				T temp=arr[i];
    				arr[i]=arr[j];
    				arr[j]=temp;
    			}
    		}
    	}
	  	
	}
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
		
		class sortrollnowi implements Comparator<student>
		{

			@Override
			public int compare(student o1, student o2) 
			{
			  return o1.getRoll()-o2.getRoll();
			}
			
		}
		
		 System.out.println("Before sorting :");
		
		 for(student s1:s)
		 {
			 System.out.println(s1);
		 }
		
		  
		 tester.<student>sort(s, new sortrollnowi());
	
		 
		 System.out.println("after sorting :");
		 for(student s1:s)
		 {
			 System.out.println(s1);
		 }
	}

}
