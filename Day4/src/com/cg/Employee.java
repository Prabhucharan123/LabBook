package com.cg;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double baseSalary;
	public Employee(int employeeId,String employeeName, Double baseSalary) {
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.baseSalary=baseSalary;
	}
	public  Employee() {
		
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
		
	}
	public Double getBaseSalary() {
		return baseSalary;
		
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId=employeeId;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName=employeeName;
	}
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary=baseSalary;
	}
	

}
