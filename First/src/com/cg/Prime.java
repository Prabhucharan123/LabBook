package com.cg;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
			Scanner a=new Scanner(System.in);
			System.out.println("please enter an integer numnber");
			int n=a.nextInt();
			//int count=0;
			if(n>1) {
				
				for(int i=1;i<=n;i++) {
					if(n%i == 0);
					{
						count++;
					}
					}
				
					if(count==2) 
					{
						System.out.println(n+" is  prime");
					}
					else
					{
						System.out.println(n+ " is not  prime");
					}
				}
					else
					{
						System.out.println(n+ " is neither prime nor composite");
					}
				}
	}


