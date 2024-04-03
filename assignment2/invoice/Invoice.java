package com.sunbeam.invoice;

public class Invoice {
	
	private String pnum;
	private String pdesc;
	private int qty;
	private double price;
	
	public Invoice(){
		this("","",0,0.0);
	
	}
	
	public Invoice(String pnum, String pdesc, int qty, double price) {
		
		this.pnum = pnum;
		this.pdesc = pdesc;
		this.qty = qty;
		this.price = price;
	}
	
	public void setPnum(String pnum) {
		this.pnum=pnum;
		
	}
	
	public String getPnum() {
		return pnum;
	}
	
	public void setPdesc(String pdesc) {
		this.pdesc=pdesc;
		
	}
	
	public String getPdesc() {
		return pdesc;
	}
	
	
	
	public void setQty(int qty) {
		if(qty<0)
		{qty=0;
		}
		this.qty=qty;
		
	}
	
	public int getQty() {
		return qty;
	}
	
	
	public void setPrice(double price) {
		if(price<0) {
			price=0;
		}
		this.price=price;
		
	}
	
	public double getPrice() {
		return price;
	}
	
	
	public double calculateInvoice(){
	return price*qty;
	}

}
