package com.cg;

public class Delux extends Hotel{
	private int totalsql ;
    private int ratepersqft;
	public Delux(int hotelId, String hotelName, double rateperSqft, double totalsqft, boolean wifi, boolean tv,
			int totalsql, int ratepersqft2) {
		super(hotelId, hotelName, rateperSqft, totalsqft, wifi, tv);
		this.totalsql = totalsql;
		ratepersqft = ratepersqft2;
	}
	public Delux(int hotelId, String hotelName, double rateperSqft, double totalsqft, boolean wifi, boolean tv) {
		super(hotelId, hotelName, rateperSqft, totalsqft, wifi, tv);
	}
	public int getTotalsql() {
		return totalsql;
	}
	public void setTotalsql(int totalsql) {
		this.totalsql = totalsql;
	}
	public int getRatepersqft() {
		return ratepersqft;
	}
	public void setRatepersqft(int ratepersqft) {
		this.ratepersqft = ratepersqft;
	}
    
	

}
