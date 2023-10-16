package com.cg;

public class Foodie {
	 private int fid;
	 private String foodieName;
	 private String city; 
	 private double mobileno;
	 private double totalprice;
	public Foodie(int fid, String foodieName, String city, double mobileno, double totalprice) {
		super();
		this.fid = fid;
		this.foodieName = foodieName;
		this.city = city;
		this.mobileno = mobileno;
		this.totalprice = totalprice;
	}
	public Foodie() {
		super();
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFoodieName() {
		return foodieName;
	}
	public void setFoodieName(String foodieName) {
		this.foodieName = foodieName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getMobileno() {
		return mobileno;
	}
	public void setMobileno(double mobileno) {
		this.mobileno = mobileno;
	}
	public double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}
	void calcuatePrice(Pizza [] pizza){
		
		
double totalPrice=(super.getPrice())*(super.getQnt());
		 

    }
}
