package pizza.com.cg;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="20;30;40;50";
		 String []mystr=str.split(";");
		 int sum=0;
			 for(int i=0;i<mystr.length;i++) {
				int s1=Integer.parseInt(mystr[i]);
				sum=sum+s1;
				 
				 
			 }
			 System.out.println("sum of numbers is: "+sum);

	}

}
