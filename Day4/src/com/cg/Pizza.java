package com.cg;

public class Pizza {
	private String size;
	private double price;
	private int qnt;
	Pizza(String size,int qnt){
		this.size=size;
		this.qnt=qnt;
		if(size=="medium") {
			this.price=100;
		}else if(size=="regular") {
			this.price=50;
		}if(size=="large") {
			this.price=200;
		}
		
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQnt() {
		return qnt;
	}
	public void setQnt(int qnt) {
		this.qnt = qnt;
	}

}
