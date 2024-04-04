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