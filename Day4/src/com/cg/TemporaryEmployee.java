package com.cg;

public class TemporaryEmployee extends Employee{
	private double servicePeriod;

	public TemporaryEmployee(int employeeId, String employeeName, Double baseSalary, double servicePeriod) {
		super(employeeId, employeeName, baseSalary);
		this.servicePeriod = servicePeriod;
	}

	public TemporaryEmployee(int employeeId, String employeeName, Double baseSalary) {
		super(employeeId, employeeName, baseSalary);
	}

	public double getServicePeriod() {
		return servicePeriod;
	}

	public void setServicePeriod(double servicePeriod) {
		this.servicePeriod = servicePeriod;
	}
	public void calculateSalaryHike() {
		double baseSalary=super.getBaseSalary();
		System.out.println("TemporaryEmployee Salary :"+servicePeriod*(baseSalary+(5*baseSalary/100)));
	}
	

}
