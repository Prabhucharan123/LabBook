package handson.com.cg;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 6. int n=12345;

		// print all the digits of the number and count the no of digits
		int n=12345;
		
		String s=Integer.toString(n);
		for(int i=0;i<s.length();i++) {
			String s1=" "+s.charAt(i);
			System.out.print(s1);
			
}
	System.out.println("\n"+"count of no of digits "+"\n"+s.length());
	}
}
