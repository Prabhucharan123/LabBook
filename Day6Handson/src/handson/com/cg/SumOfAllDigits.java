package handson.com.cg;

public class SumOfAllDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. String str="1234"
        // find the sum of all the digits 
		String s="1234";
		
		int sum=0;
		for(int i=0;i<s.length();i++) {
			String n=""+s.charAt(i);
			
			int num=Integer.parseInt(n);
			sum=sum+num;
			//System.out.println("sum of the digits "+ sum);
			
		}
		System.out.println("sum of the digits "+ sum);
		
		
		
		

	}

}
