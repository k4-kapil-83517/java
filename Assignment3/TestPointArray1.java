package com.app.tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int pointsno;
		int choice;
		System.out.println("Enter no of points to plot : ");
		pointsno = sc.nextInt();
		
		Point2D parr[] = new Point2D[pointsno];
		
		for(int i=0; i<pointsno; i++)
		{
			double xi;
			double yi;

			System.out.println("Enter values for point "+(i+1)+" (x"+(i+1)+",y"+(i+1)+") : ");
			xi = sc.nextDouble();
			yi = sc.nextDouble();
			parr[i] = new Point2D(xi,yi);
		
			
		}
		
		do
		{
			
			System.out.println("1. Display details of a specific point ");
			System.out.println("2. Display x, y co-ordinates of all points");
			System.out.println("3. Calculate Distance between two points");
			System.out.println("4. Exit");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				{
					int p;
					System.out.print("Enter Index of Point to display : ");
					p = sc.nextInt();
					
							if(p-1<pointsno)
								{
									System.out.println("DETAILS OF POINT "+(p)+": "+parr[p-1].getDetails());
									
								}
								
							else
								{
									System.out.println("Invalid Index, please retry!!!");
									
								}
							
				}
				break;
				
				case 2:
				{
					for(Point2D pref : parr )
						System.out.println("Points values for x and y : "+pref.getDetails());
				}
				break;
				case 3:
				{
					int pstart,pend;
					System.out.print("Enter Index of Starting Point : ");
					pstart = sc.nextInt();
					if(pstart-1 >=0 && pstart-1< pointsno)
					{
						System.out.print("Enter Index of Ending Point : ");
						pend = sc.nextInt();
						if(pend-1 >=0 && pend-1< pointsno)
						{
							if(pstart-1 != pend-1)
							{
								if(parr[pstart-1].isEqual(parr[pend-1]))
								{
									System.out.println("Start Point and End Point are located at the Same position");
								}
								else
								{
									System.out.println("Start Point and End Point are located at the Different position");
									double distance = parr[pstart-1].calculateDistance(parr[pend-1]);
									System.out.println("Distance Between Start and End Points = " + distance);			
								}
							}
							else
							{
								System.out.println("Enter Valid Index");
							}
						}
						else
						{
							System.out.println("Enter Valid Index");
						}
					}
					else
					{
						System.out.println("Enter Valid Index");
					}
				}
				break;
			}
			
		}while(choice != 4);
		sc.close();

	}

}