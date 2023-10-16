package com.cg;

public class Triangle extends Figure {
	public Triangle(double dim1, double dim2) {
		super(dim1, dim2);
		// TODO Auto-generated constructor stub
	}

	public void area() {
		double area=0.5*dim1*dim2;
		System.out.println("Area of Triangle is "+area);
	}
	

}
