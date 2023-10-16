package com.cg;

public class SourceFood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food f=new Food(1,"pizza","chinese","cash",200);
		Food f1=new Food(2,"dosa","indian","upi",100);
		Food f2=new Food(3,"upma","american","card",40);
		Food[] fd= {f,f1,f2};
		Order o=new Order(111,0,fd);
		o.calcuatePrice("cash");

	}

}
