package com.cg;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee(121,"charan",12000.00);
		PermanentEmployee e1=new PermanentEmployee(123,"Prabhu",15000.0,"manager",5.0);
		e1.calculateSalaryHike();
		
	
		TemporaryEmployee e3=new TemporaryEmployee(123,"Prabhu Charan",15000.0,2.0);
		e3.calculateSalaryHike();
		

	}

}
