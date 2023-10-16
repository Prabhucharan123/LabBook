package com.cg;

public class PremiumUser extends User{
	private int rewardPoint;

	public PremiumUser(int uid, String uname, String email, int walletBalance, int rewardPoint) {
		super(uid, uname, email, walletBalance);
		this.rewardPoint = rewardPoint;
	}

	public PremiumUser(int uid, String uname, String email, int walletBalance) {
		super(uid, uname, email, walletBalance);
	}

	public int getRewardPoint() {
		return rewardPoint;
	}

	public void setRewardPoint(int rewardPoint) {
		this.rewardPoint = rewardPoint;
	}
	void makePayment(double amt) {
		double walletBalance=super.getWalletBalance();
		String uname=super.getUname();
		if(amt<=walletBalance) {
			walletBalance=walletBalance-amt;
			System.out.println("Congratulation "+uname+" , payment of Rs "+amt+" was done succesfully\r\n"
					+ "   your wallet balance is Rs "+walletBalance+" .\r\n"
					+ "   you have "+10+" points");
			
		}else {
			//walletBalance=walletBalance-amt;
			System.out.println("Sorry "+uname+" you do not have enough balance to pay the bill\r\n"
					+ "  your walle balance is Rs +walletBalance "+" \r\n"
					+ "  you have "+10+" points");
			
		}
	}

}
