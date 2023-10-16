package com.cg;

import java.util.Scanner;

public class SourceAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Account a=new Account(1234,"charan",5000);
		a.setDeposit(1000);
		a.setPrintbal(0);
		a.setWithdraw(200);
		
		
        a.accountDetails();
		a.newTransaction();
		
		

	}

}
