package handson.com.cg;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5.  String str="rahul sachin vinod anil"
	      // sort those string 

	       // anil rahul sachin vinod

		String str="rahul sachin vinod anil";
		String[] str1=str.split(" ");
		Arrays.sort(str1);
		for(int i=0; i<str1.length;i++) {
			System.out.print(str1[i]+" ");
		}

	}

}
