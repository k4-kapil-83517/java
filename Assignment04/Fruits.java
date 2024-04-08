/*Apply inheritance n polymorphism
a) Arrange Fruit,Apple,Orange,Mango in inheritance hierarchy
b) Properties (instance variables) : color : String , weight : double , name:String, isFresh : boolean
c) Add suitable constructors.
d) Override toString correctly to return state of all fruits (including : name ,color , weight )
e) Add a taste() method : public String taste()*/
package com.sunbeam.fruits;

import java.util.Scanner;

public class Fruits 
{
	private String name;
	private String color;
	private double weight;
	private boolean isFresh;
	
	public Fruits(String name,String color, boolean isFresh)
	{
		this.name=name;
		this.color=color;
		this.isFresh= true;
	}
	
	
	
	public boolean isIsfresh() 
	{
		return isFresh;
	}



	public void setFresh(boolean isFresh) 
	{
		this.isFresh = isFresh;
	}



	public String taste()
	{
		return "no specific taste";
	}
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	
	

	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public double getWeight() {
		return weight;
	}



	public void setWeight(double weight) {
		this.weight = weight;
	}



	


	@Override
	public String toString() {
		return "Fruits [name=" + name + ", color=" + color + ", weight=" + weight + ", isFresh=" + isFresh + "]";
	}



	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Weigth of Fruit = ");
		weight = sc.nextDouble();
	}
//	public void display()
//	{
//		System.out.println("----------FRUIT DETAILS----------");
//		System.out.println("Fruit Name - "+this.name);
//		System.out.println("Fruit Color - "+this.color);
//		System.out.println("Fruit Weight - "+weight+" kg");
//		System.out.println("Fruit is Fresh - "+this.isFresh);
//		System.out.println("Taste of Fruit - "+this.taste());
//	}
}
