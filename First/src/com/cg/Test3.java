package com.cg;

public class Test3 {
 public static void main(String[] args) {
	 int a=Integer.parseInt(args[0]);
	 int b=Integer.parseInt(args[1]);
	 int c=Integer.parseInt(args[2]);
	 if(a>b && a>c) {
		 System.out.println(a);
	 }
	 else if(b>c && b>a) {
		 System.out.println("big number is "+b);
		 
	 }else {
		 System.out.println(c);
	 }
 }
}
