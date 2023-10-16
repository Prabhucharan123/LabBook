package com.cg;

public class Course {
	private int cId;
	private String cName;
	private long fees;
	Course(int cId, String cName, long fees){
		this.cId=cId;
		this.cName=cName;
		this.fees=fees;
		
	}
	Course(){
		
	}
	public int getcId() {
		return cId;
		
	}
	public String getcName() {
		return cName;
	}
	public long getfees() {
		return fees;
		
	}
	public void setcId(int cId) {
		this.cId=cId;
	}
	public void setcName(String cName) {
		this.cName=cName;
		
	}
	public void setfees(long fees) {
		this.fees=fees;
	}
	@Override
	public String toString() {
		return "Course [cId=" + cId + ", cName=" + cName + ", fees=" + fees + "]";
	}
	

}
