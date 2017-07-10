package com.javaex.problem02;

public class Depart extends Employee {
	private String department;

	public Depart(String name, int salary, String department) {
		// TODO Auto-generated constructor stub
		super(name, salary);
		this.department = department;
	}
	public void getInformation() {
        System.out.println("이름:" + getName() +
        		"\t연봉:" + getSalary() + "\t\t부서:" + department);
	}

    //코드작성

}
