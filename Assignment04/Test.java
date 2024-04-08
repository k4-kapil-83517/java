package com.sunbeam.tester;

import java.util.Scanner;
import com.sunbeam.fruits.*;

public class Test 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Fruits[] FruitBasket = new Fruits[5];
		Fruits f;
		int choice;
		int index = 0;
		do 
		{
			System.out.println("0. Exit");
			System.out.println("1. Add Mango");
			System.out.println("2. Add Orange");
			System.out.println("3. Add Apple");
			System.out.println("4. Display names of all fruits in the basket");
			System.out.println("5. Display name,color,weight , taste of all fresh fruits , in the basket");
			System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket");
			System.out.println("7. Mark a fruit as stale");
			System.out.println("8. Mark all sour fruits stale");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			
			switch( choice)
			{
			case 0:
				System.out.println("THANK YOU FOR SHOPPING....");
				break;
				
			case 1:
				{
					if(index<5)
					{
						f = new Apple("APPLE","RED",true);
						f.accept();
						FruitBasket[index] = f;
						System.out.println("FRUIT ADDED TO BASKET.");
						index++;
					}
					else
					{
						System.out.println("BASKET IS FULL ......");
					}
				}
				break;
				
			case 2:
				{
					if(index<5)
					{
						f = new Mango("MANGO","YELLOW",true);
						f.accept();
						FruitBasket[index] = f;
						System.out.println("FRUIT ADDED TO BASKET.");
						index++;
					}
					else
					{
						System.out.println("BASKET IS FULL ......");
					}
				}
				break;
			
			case 3:
				{
					if(index<5)
					{
						f = new Orange("ORANGE","ORANGE",true);
						f.accept();
						FruitBasket[index] = f;
						System.out.println("FRUIT ADDED TO BASKET.");
						index++;
					}
					else
					{
						System.out.println("BASKET IS FULL ......");
					}
				}
				break;
			
			case 4:
				{
					System.out.println("FRUITS IN THE BASKET - ");
					for(int i=0; i<index; i++)
					{
						System.out.println("("+(i+1)+")"+FruitBasket[i].getName());	
					}
				}
				break;
				
			case 5:
				{
					for (Fruits fruits : FruitBasket) 
					{
						if(fruits != null)
							if(fruits.isIsfresh()==true)
							{
								System.out.println(fruits);
							}
					}
					System.out.println("No Fresh fruit present in Basket.");
				}
				break;
				
				
			case 6:
				{
					for (Fruits fruits : FruitBasket) 
					{
						if(fruits != null)
							if(fruits.isIsfresh()==false)
								System.out.println(fruits);
					}
					System.out.println("No STALE fruit present in Basket.");
				}
				break;				
				
			case 7:
				{
					int findex;
					System.out.print("Enter Fruit Index which is STALE : ");
					findex = sc.nextInt();
					if(findex<5 && FruitBasket[findex]!=null)
						FruitBasket[findex].setFresh(false);
					else
						System.out.println("Enter Proper Index");
				}
				break;
				
			case 8:
				{
					for(int i=0; i<index; i++)
					{
						if(FruitBasket[i].taste() == "Sour")
						{
							FruitBasket[i].setFresh(false);
						}
						else
							System.out.println("No Fruit present in Basket with SOUR taste");
					}
				}
				break;
				
			default:
				System.out.println("WRONG CHOICE.....");
				break;
			}	
		}while(choice != 0);
	}

}
