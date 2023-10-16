package com.cg;

import java.util.Scanner;

public class Factirial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an integer");
		int num = sc.nextInt();
		
		
		long fact = 1;
		int i = 1;
		
		do
		{
			fact = fact * i;
			i++;
		} while (i <= num);
		
		System.out.println("The factorial is "+ num+" is " +fact);
		// TODO Auto-generated method stub

	}

}
