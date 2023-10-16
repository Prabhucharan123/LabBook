package com.cg;

import java.util.Arrays;

public class Student1 {
   private int sId;
	private String sName;
	  private Course []course;
	  Student1(int sId,String sName, Course []course){
		  this.sId=sId;
		  this.sName=sName;
		  this.course=course;
	  }
	  Student1(){
		  
	  }
	  public int getsId() {
		  return sId;
	  }
	  public String getsName(){
		  return sName;
	  }
	  public Course[] getcourse() {
		  return course;
	  }
	  public void setsName(String sName) {
		  this.sName=sName;
		  
	  }
	  public void setsId(int sId) {
		  this.sId=sId;
	  }
	  public void setcourse(Course[] course) {
		  this.course=course;
	  }
	@Override
	public String toString() {
		return "Student1 [sId=" + sId + ", sName=" + sName + ", course=" + Arrays.toString(course) + "]";
	}
	
	  

}
