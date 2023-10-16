package com.cg;

public class CabServiceProvider {
	private String servicename;
    private int totalcabs;
    
  public CabServiceProvider(String servicename, int totalcabs) {
		super();
		this.servicename = servicename;
		this.totalcabs = totalcabs;
	}
public CabServiceProvider() {
	super();
} 

public String getServicename() {
	return servicename;
}
public void setServicename(String servicename) {
	this.servicename = servicename;
}
public int getTotalcabs() {
	return totalcabs;
}
public void setTotalcabs(int totalcabs) {
	this.totalcabs = totalcabs;
}
void    calculateReward(Driver d) {
//for(int i=0,i<d.length,i++) {
	
	double rating ;
	if(rating>4.5) {
		System.out.println("platinum");
	}else if(rating>3.5) {
		System.out.println("gold");
	}else
		System.out.println("silver");
}
}


