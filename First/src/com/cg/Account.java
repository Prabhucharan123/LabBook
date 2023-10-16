package com.cg;

public class Account {
	private int Acno;
	private String Acname;
	private int Bal;
	public int withdraw;
	public int deposit;
	public int printbal;
	
	public int getPrintbal() {
		return printbal;
	}
	public void setPrintbal(int printbal) {
		this.printbal = printbal;
	}
	public int getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public Account(int acno, String acname, int Bal) {
		super();
		Acno = acno;
		Acname = acname;
		this.Bal = Bal;
	}
	public void accountDetails() {

		System.out.println("Account Number: "+Acno);
		System.out.println("Account Holder Name: "+Acname);
		System.out.println("Balance: "+Bal);


	}
	public void newTransaction() {

		System.out.println("Amount to be withdrawn: "+withdraw);

		printbal=Bal-withdraw;
		System.out.println("Available balance after withdrawl: "+printbal);

		System.out.println("Amount to be deposited: "+deposit);
		printbal=printbal+deposit;
		System.out.println("Available balance after deposit: "+printbal);
	}
	

}

