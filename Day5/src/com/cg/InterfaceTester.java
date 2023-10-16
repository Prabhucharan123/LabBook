package com.cg;

public class InterfaceTester {
	public static void main(String[] args) {
		TaxiCab olaCar = new TaxiCab();
		olaCar.calculateFare(5);
        // After travelling
        System.out.println("Your bill amount is: Rs." + olaCar.billAmount);
        System.out.println("your bill amount is: Rs. "+olaCar.calculateFare(5));
	}

}
