package com.sunbeam.fruits;

public class Orange extends Fruits
{
	public Orange(String name, String color, boolean isFresh)
	{
		super(name,color,isFresh);
	}
	public String taste()
	{
		return "Sour";
	}
}
