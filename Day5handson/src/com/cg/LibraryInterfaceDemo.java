package com.cg;

import java.util.Scanner;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		System.out.println("Enter the bookType:");
		String bookType=sc.next();
		
		
		KidUser k=new KidUser();
		k.registerAccount(age);
		k.requestBook(bookType);
		AdultUser au=new AdultUser();
		au.registerAccount(age);
		au.requestBook(bookType);
		

	}

}
