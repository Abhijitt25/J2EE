package com.demo.model;

public class Employee {
	 
	private int Empno;
	private String Start_Date;
	private String End_Date;
	private String Leave_Type;
	private String Leave_Reason;
	public Employee() {
		super();
	}
	public Employee(int empno, String start_Date, String end_Date, String leave_Type, String leave_Reason) {
		super();
		Empno = empno;
		Start_Date = start_Date;
		End_Date = end_Date;
		Leave_Type = leave_Type;
		Leave_Reason = leave_Reason;
	}
	public int getEmpno() {
		return Empno;
	}
	public void setEmpno(int empno) {
		Empno = empno;
	}
	public String getStart_Date() {
		return Start_Date;
	}
	public void setStart_Date(String start_Date) {
		Start_Date = start_Date;
	}
	public String getEnd_Date() {
		return End_Date;
	}
	public void setEnd_Date(String end_Date) {
		End_Date = end_Date;
	}
	public String getLeave_Type() {
		return Leave_Type;
	}
	public void setLeave_Type(String leave_Type) {
		Leave_Type = leave_Type;
	}
	public String getLeave_Reason() {
		return Leave_Reason;
	}
	public void setLeave_Reason(String leave_Reason) {
		Leave_Reason = leave_Reason;
	}
	@Override
	public String toString() {
		return "Employee [Empno=" + Empno + ", Start_Date=" + Start_Date + ", End_Date=" + End_Date + ", Leave_Type="
				+ Leave_Type + ", Leave_Reason=" + Leave_Reason + "]";
	}
	
	
}
