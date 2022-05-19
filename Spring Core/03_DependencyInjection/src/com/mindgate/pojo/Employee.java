package com.mindgate.pojo;

public class Employee {
	private int employeeIdt;
	private String name;
	private double salary;
	
	 private Address homeAddress;
	public Employee() {
		System.out.println("Default constructor of employee called");
		}
	public Employee(int employeeIdt, String name, double salary, Address homeAddress) {
		super();
		this.employeeIdt = employeeIdt;
		this.name = name;
		this.salary = salary;
		this.homeAddress = homeAddress;
		System.out.println("Parametriesd  constructor of employee called");
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
		System.out.println(" set name"+ name);
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
		System.out.println("set salary"+ salary);
	}
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
		System.out.println(" set homeadress"+ homeAddress);
	}
	@Override
	public String toString() {
		return "Employee [employeeIdt=" + employeeIdt + ", name=" + name + ", salary=" + salary + ", homeAddress="
				+ homeAddress + "]";
	}
	
	

}
