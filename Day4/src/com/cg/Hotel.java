package com.cg;

public class Hotel {
	private int hotelId;
	private String hotelName;
	private double rateperSqft;
	private double totalsqft;
    boolean  wifi;
    boolean Tv;
  public Hotel(int hotelId, String hotelName, double rateperSqft, double totalsqft, boolean wifi, boolean tv) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.rateperSqft = rateperSqft;
		this.totalsqft = totalsqft;
		this.wifi = wifi;
		Tv = tv;
	}
  
public Hotel() {
	super();
}

public int getHotelId() {
	return hotelId;
}

public void setHotelId(int hotelId) {
	this.hotelId = hotelId;
}

public String getHotelName() {
	return hotelName;
}

public void setHotelName(String hotelName) {
	this.hotelName = hotelName;
}

public double getRateperSqft() {
	return rateperSqft;
}

public void setRateperSqft(double rateperSqft) {
	this.rateperSqft = rateperSqft;
}

public double getTotalsqft() {
	return totalsqft;
}

public void setTotalsqft(double totalsqft) {
	this.totalsqft = totalsqft;
}

public boolean isWifi() {
	return wifi;
}

public void setWifi(boolean wifi) {
	this.wifi = wifi;
}

public boolean isTv() {
	return Tv;
}

public void setTv(boolean tv) {
	Tv = tv;
}

void calcualteTariff(){
	  
  }
	

}
