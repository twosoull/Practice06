package com.javaex.ex04;

public class Employee extends User {
	//필드
	//급여
	private int salary;
	
	//생성자
	public Employee() {
		
	}

	public Employee(int salary) {
		
		this.salary = salary;
	}
		//상속+생성자
	public Employee(String id,String password,String name,int salary) {
		super(id,password,name);
		this.salary = salary;
	}
		//상속생성자만
	public Employee(String id,String password,String name) {
		super(id,password,name);
		
	}

	//메소드 g/s
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	//메소드 일반
	public void showInfo() {
		System.out.println("#아이디:"+getId()+", #패스워드:"+getPassword()+", #이름:"+getName()+", #월급:"+salary);
	}
	
	
	
}
