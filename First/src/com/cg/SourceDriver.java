package com.cg;

public class SourceDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CabServiceProvider csp=new CabServiceProvider("car wash",3);
		//CabServiceProvider csp1=new CabSeriveProvider("servising")
		csp.calculateReward(null);
		Driver driver=new Driver("charan",4.5);
		Driver driver1=new Driver("rahul",3.5);
		Driver driver2=new Driver("chandu",2.5);
		Driver[] d= {driver,driver1,driver2};

	}

}
