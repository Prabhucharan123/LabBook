package com.cg;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u=new User(121,"charan","charan@123",500);
		u.makePayment(200);
		PremiumUser pu=new PremiumUser(234,"prabhu","prabhu@123",600);
		pu.makePayment(50);
		

	}

}
