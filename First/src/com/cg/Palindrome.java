package com.cg;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
	//int n=Integer.parseInt(args[0]);
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	int sum=0; int temp,r;
	temp=n;
	while(n>0) {
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
	}
	if(temp==sum) {
	System.out.println(sum+" is a palindrome");
	}else {
		System.out.println(sum+" is not a palindrome");
	}
	
	}
}
