package com.employee.salary;

import java.util.Scanner;

import com.employee.interfaces.Acceptable;

public class CommissionEmployees extends Employee implements Acceptable {
double commissionRate;
double grossSales;
@Override
	public void acceptData(Scanner sc) {
		// TODO Auto-generated method stub
		super.acceptData(sc);
		System.out.print("Enter Commission Rate - ");
		commissionRate = sc.nextDouble();
		System.out.print("Enter Gross Sales - ");
		grossSales = sc.nextDouble();
	}
	@Override
	public void calculateTotalSalary() {
		// TODO Auto-generated method stub
earning=commissionRate*grossSales;
	}
	@Override
	public String toString() {
		return "CommissionEmployees : \n commissionRate =" + commissionRate + "\n  grossSales=" + grossSales + "\n  firstName="
				+ firstName + "\n  lastName=" + lastName + "\n  socialSecurityNumber=" + socialSecurityNumber + "\n  earning="
				+ earning  ;
	}

}
