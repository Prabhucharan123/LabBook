package com.cg;

import java.util.Scanner;

public class SourceEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in) ;
		System.out.println("enter Employee Id");
		int Empid=sc.nextInt();
		System.out.println("enter Employee Name");
		String Empname=sc.next();
		System.out.println("enter Basic pay");
		int basicpay=sc.nextInt();
		Employee emp=new Employee(Empid,Empname,basicpay);
		emp.accountDetails();
		System.out.println(emp);
		emp.generateSalary();
		
			
		

	}

}
