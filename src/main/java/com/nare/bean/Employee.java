package com.nare.bean;

public class Employee {
	private int i;
	private String name;
	public Employee(int i, String name) {
		super();
		this.i = i;
		this.name = name;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [i=" + i + ", name=" + name + "]";
	}
	

}
