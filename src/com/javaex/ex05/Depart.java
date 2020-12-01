package com.javaex.ex05;

public class Depart extends Employee {
	
	//필드
	
	private String department;
	//3
	//생성자
	public Depart() {
		
	}
	public Depart(String department) {
		this.department = department;
		
	}
	public Depart(String name, int salary,String department) {
		
		super(name,salary);
		this.department = department;
		System.out.println("그다음");
	}
	//메소드 d/s
	public String getDepartment() {
		
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	//메소드 일반
	public void showInformation() {
		System.out.println("둘러보기 시작");
		System.out.println("이름:" + super.getName() + "연봉:" + super.getSalary()+"부서"+department);
	}
	
}
