package com.cg;

public class TaxiCab implements PublicTransport{
	double billAmount;
	public double calculateFare(int d) {
		return (d*rate)+minAmount;
		
		
		
	}
	

}
