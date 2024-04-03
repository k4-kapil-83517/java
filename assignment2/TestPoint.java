package com.app.tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) 
	{
		double x1,x2,y1,y2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values for point 1 (x1,y1) : ");
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		Point2D p1 = new Point2D(x1,y1);
		
		System.out.println("Enter values for point 2 (x2,y2) : ");
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		Point2D p2 = new Point2D(x2,y2);
		
		System.out.println("DETAILS OF POINT 1 : "+p1.getDetails());
		System.out.println("DETAILS OF POINT 2 : "+p2.getDetails());
		
		if(p1.isEqual(p2))
		{
			System.out.println("Points p1 and p2 are located at the same position");
		}
		else
		{
			System.out.println("Points p1 and p2 are located at the different position");
			double distance = p1.calculateDistance(p2);
			System.out.println("Distance Between Points p1 and p2 = " + distance);			
		}
		
	
		
		sc.close();

	}

}
