package com.mindgate.main;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class Main {
	public static void main(String[] args) {
		Address address= new Address(101, "s.v road", "mumbai", "maharashtra");
		Employee employee= new Employee(101, "Pravin", 25020, address );
		System.out.println(employee);
	}

}
