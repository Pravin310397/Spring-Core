package com.mindgate.pojo;

public class Employee {
	private int employeeIdt;
	private String name;
	private double salary;
	
	Address homeAddress;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int employeeIdt, String name, double salary, Address homeAddress) {
		super();
		this.employeeIdt = employeeIdt;
		this.name = name;
		this.salary = salary;
		this.homeAddress = homeAddress;
	}
	public int getEmployeeIdt() {
		return employeeIdt;
	}
	public void setEmployeeIdt(int employeeIdt) {
		this.employeeIdt = employeeIdt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	@Override
	public String toString() {
		return "Employee [employeeIdt=" + employeeIdt + ", name=" + name + ", salary=" + salary + ", homeAddress="
				+ homeAddress + ", getEmployeeIdt()=" + getEmployeeIdt() + ", getName()=" + getName() + ", getSalary()="
				+ getSalary() + ", getHomeAddress()=" + getHomeAddress() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
