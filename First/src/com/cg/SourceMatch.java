package com.cg;

import java.util.Scanner;

public class SourceMatch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the country name");
		String country=sc.next();
		System.out.println("enter the captain name");
		String captain=sc.next();
		System.out.println("enter the matches");
		int noMatchesPlayed=sc.nextInt();
		
		
		// TODO Auto-generated method stub
		
		Match m=new Match(country, captain, noMatchesPlayed);
		System.out.println(m);
		
		

	}

}
