package handson.com.cg;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. String sat="30;32;50;26;70";
        // find the sum of all the digits where 2 exist
		String str="30;32;50;26;70";
		String[] str1=str.split(";");
		int sum=0;
		for(int i=0;i<str1.length;i++) {
			if(str1[i].contains("2")){
			int n=Integer.parseInt(str1[i]);
			sum=sum+n;
		}
			
		}System.out.println("sum of the digits that contain 2 is :"+sum);
	}
}
