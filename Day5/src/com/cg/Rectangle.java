package com.cg;

public class Rectangle  extends Figure{
	public Rectangle(double dim1, double dim2) {
		super(dim1, dim2);
		// TODO Auto-generated constructor stub
	}

	public void area() {
		
		double area=dim1*dim2;
		System.out.println("Area of Rectanlge is "+area);
	}

}
