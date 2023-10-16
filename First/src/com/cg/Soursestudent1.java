package com.cg;

public class Soursestudent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course c=new Course(801,"Java",2000);
		Course c1=new Course(802,"C",1000);
		Course c2=new Course(803,"C++",4000);
		Course []courses= {c,c1,c2};
		
		Student1 s=new Student1(121,"Bharat",courses);
		System.out.println(s.getsId()+" "+s.getsName());

		Course[] number =s.getcourse();

		long total=0;

		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i].getcId()+" "+number[i].getcName()+" "+number[i].getfees());
			total = total+number[i].getfees();
		}

		System.out.println("Total fees Rs "+total);
	}

	}


