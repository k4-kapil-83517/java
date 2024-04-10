package com.sunbeam;

public class ExceptionLineTooLong extends Exception 
{
	private String message;

	public ExceptionLineTooLong(String message) {
		super();
		this.message = message;
	}
	@Override
	public void printStackTrace() 
	{
		super.printStackTrace();
		System.err.println("ExceptionLineTooLong:"+message);
	}
}
