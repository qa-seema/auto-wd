package com.wd.auto;

public class Employee {

	protected String name;
	protected Company company;

	public Employee(String name) {
		this.name = name;
	}

	String getEmployeeCompanyName() {

		return company.getCompanyName();
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", company=" + company.getCompanyName() + "]";
	}

}
