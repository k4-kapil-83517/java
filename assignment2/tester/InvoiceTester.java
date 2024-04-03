package com.sunbeam.tester;

import com.sunbeam.invoice.Invoice;

public class InvoiceTester {

	public static void main(String[] args) {
		Invoice i= new Invoice("1001","MOUSE",2,200);
		System.out.println("PART NUMBEAR = "+i.getPnum());
		System.out.println("PART DESCRIPTION = "+i.getPdesc());
		System.out.println("PART QUNTITY = "+i.getQty());
		System.out.println("PART PRICE = "+i.getPrice());
		System.out.println("CALCULATE INVOICE = "+i.calculateInvoice());

	}

}
