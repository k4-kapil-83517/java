package com.employee.tester;

import java.util.Scanner;

import com.employee.salary.BaseSalariedCommissionEmployees;
import com.employee.salary.CommissionEmployees;
import com.employee.salary.Employee;
import com.employee.salary.HourlyEmployees;
import com.employee.salary.SalariedEmployees;

public class tester {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
       // Employee e=null;
			
		int choice;
      
        while (true) {
            System.out.println("0. Exit");
            System.out.println("1. Add Salaried Employee");
            System.out.println("2. Add Hourly Employee");
            System.out.println("3. Add Commissioned Employee");
            System.out.println("4. Add Base-salaried commission employees");
            
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 0:
                    System.out.println("Exiting...");
                    System.out.println("Thank you...");
                    System.exit(0);
                case 1:{
                	Employee e =new SalariedEmployees(); 
                   e.acceptData(scanner);
                   e.calculateTotalSalary();
                   System.out.println(e.toString());
                }
                    break;
                case 2:{
//                	Employee e =new SalariedEmployees(); 
                	Employee e =new HourlyEmployees(); 
                    e.acceptData(scanner);
                    e.calculateTotalSalary();
                    System.out.println(e.toString());
                }
                    break;
                case 3:{
                	Employee e =new CommissionEmployees(); 
                    e.acceptData(scanner);
                    e.calculateTotalSalary();
                    System.out.println(e.toString());
                }
                    break;
                case 4:{
                	Employee e =new BaseSalariedCommissionEmployees(); 
                	BaseSalariedCommissionEmployees b=(BaseSalariedCommissionEmployees) e;
                    e.acceptData(scanner);
                    e.calculateTotalSalary();
                    b.incremmentSal();
                    System.out.println(e.toString());
                }
                    break;
              
                default:
                    System.out.println("Invalid choice!");
            }
          
        }
     // scanner.close();
       
    }

}
