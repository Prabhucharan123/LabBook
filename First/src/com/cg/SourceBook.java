package com.cg;

import java.util.Scanner;

public class SourceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter book no");
		int bno=sc.nextInt();
		System.out.println("enter book title");
		String title=sc.next();
		System.out.println("enter book author");
		String author=sc.next();
		System.out.println("enter book price");
		int price=sc.nextInt();
		
		
		Book b=new Book(bno,title,author,price);
		System.out.println(b);
		b.discountedPrice(5);
		b.displayDetails();
		//System.out.println();

	}

}
