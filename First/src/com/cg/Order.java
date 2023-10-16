package com.cg;

public class Order {
	private int orderid; 
	private double totalprice=0;
   //private  boolean status;
     private Food [] orderedFoods;
	public Order(int orderid, int totalprice, Food[] orderedFoods) {
		super();
		this.orderid = orderid;
		this.totalprice = totalprice;
		//this.status = status;
		this.orderedFoods = orderedFoods;
	}
	public Order() {
		super();
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}
	
	
	public Food[] getOrderedFoods() {
		return orderedFoods;
	}
	public void setOrderedFoods(Food[] orderedFoods) {
		this.orderedFoods = orderedFoods;
	}
	public Order(int orderid, Food[] orderedFoods) {

		this.orderid = orderid;
		this.orderedFoods = orderedFoods;
	}

	public void calcuatePrice(String ptype) {
		for(int i=0;i<orderedFoods.length;i++) {
			totalprice=totalprice+orderedFoods[i].getPrice();
		}

		if(ptype=="cash") {

		}else if(ptype=="card") {
			totalprice=totalprice+20;

		}else if(ptype=="upi") {
			totalprice=totalprice+10;
		}

		System.out.println(this);
	}

 

 

	@Override
	public String toString() {
		return "hey  your total price is ₹ "+ totalprice +"/-  pls pay the bill and enjoy your food ";
	}
}
