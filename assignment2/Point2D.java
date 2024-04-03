/*Q2. Create a class Point2D , in package - "com.app.geometry" : for representing a point in x-y co-
ordinate system. Create a parameterized constructor to init x & y co-ords. Add a method to return
string form of point's x & y co-ords
Hint : public String getDetails())
Add isEqual method to Point2D class :a boolean returning method : must return true if n only if
both points are having same x,y co-ords or false otherwise.
Add calculateDistance method to calculate distance between current point and specified point &
return the distance to the caller.
Hint : Use distance formula . Use java.lang.Math class methods --sqrt, pow etc.*/
package com.app.geometry;

public class Point2D 
{
	private double xaxis;
	private double yaxis;
	
	public Point2D(double xaxis,double yaxis )
	{
		this.xaxis=xaxis;
		this.yaxis=yaxis;
	}
	
	public void setXaxis(double xaxis)
	{
		this.xaxis=xaxis;
	}
	public double getXaxis()
	{
		return xaxis;
	}
	

	public void setYaxis(double yaxis)
	{
		this.yaxis=yaxis;
	}
	public double getYaxis()
	{
		return yaxis;
	}
	
	public String getDetails()
	{
		String result;
		result = "("+xaxis+","+yaxis+")";
		return result;
	}
	
	public boolean isEqual(Point2D p)
	{
		if(this.xaxis == p.xaxis && this.yaxis == p.yaxis )
		return true;
		return false;
	}
	
	public double calculateDistance(Point2D p) 
	{
        return Math.sqrt(Math.pow(p.xaxis - this.xaxis, 2) + Math.pow(p.yaxis - this.yaxis, 2));
	}
}
