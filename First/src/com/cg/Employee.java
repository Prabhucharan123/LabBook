package com.cg;

public class Employee {
	private int Empid;
	private String Empname;
	private double basicpay;
	public int da=200,hra=230,tax=3000,loan=25000,pf=1500,ded,bonus=15000;
	double gross;
	double netsal;
	public Employee(int empid, String empname, double basicpay) {
		super();
		Empid = empid;
		Empname = empname;
		this.basicpay = basicpay;
	}
	void display() {
	}
		@Override
		public String toString() {
			return "Employee [Empid=" + Empid + ", Empname=" + Empname + ", basicpay=" + basicpay + "]";
		}
	
	
	
	void generateSalary(){
		
	gross=  (basicpay+bonus+da+hra);
		//gross=basicpay+15000+2000+140;
		ded= loan+pf+tax;
		netsal= gross-ded;
		System.out.println("NetSalary ="+netsal);
		
	}
}
