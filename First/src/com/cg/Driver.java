package com.cg;

public class Driver {
	private String driverName;
   private double rating;
public Driver(String driverName, double rating) {
	super();
	this.driverName = driverName;
	this.rating = rating;
}
public Driver() {
	super();
}
public String getDriverName() {
	return driverName;
}
public void setDriverName(String driverName) {
	this.driverName = driverName;
}
public double getRating() {
	return rating;
}
public void setRating(double rating) {
	this.rating = rating;
}
   

}
