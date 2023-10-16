package com.cg;

import java.util.Scanner;

public class Printmonthinwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number");
		int n=sc.nextInt();
	//	System.out.println("Please enter the number");
		int month=n;
		switch(month) {
		case 1:System.out.println("january");
		break;
		case 2:System.out.println("Feb");
		break;
		case 3:System.out.println("March");
		break;
		case 4:System.out.println("April");
		break;
		case 5:System.out.println("May");
		break;
		case 6:System.out.println("june");
		break;
		case 7:System.out.println("july");
		break;
		case 8:System.out.println("August");
		break;
		case 9:System.out.println("september");
		break;
		case 10:System.out.println("October");
		break;
		case 11:System.out.println("November");
		break;
		case 12:System.out.println("December");
		break;
		default:System.out.println("invalid Month");
		}
	}
}
