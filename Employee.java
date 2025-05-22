package com.constructor;

public class Employee {

	String name;
	double salary;
	public Employee(String name,double salary) {
	this.name=name;
	this.salary=salary;
	if(salary<0) {
	salary=0;
	}
	}
	public void displayDetails() {
	System.out.println("Name:"+name);
	System.out.println("Salary is:"+salary);
	}
	public static void main(String[] args) {
	Employee th=new Employee("pujitha",990000);
	th.displayDetails();
	}
	}