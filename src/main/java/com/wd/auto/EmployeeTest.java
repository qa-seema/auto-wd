package com.wd.auto;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeTest extends Base {

	@Test
	public void testSuperClassVariableGetInherited() {
		System.out.println("# Super Class Company Instance get inherited: " + company);
		Assert.assertEquals(company.getCompanyName(), "X Comp");
	}

	@Test
	public void testHowToPassSuperClassObjectToEmployeeClass() {

		Employee employee = new Employee("Anuj");
		String expected = "X Comp.";
		String actual = employee.getEmployeeCompanyName();

		Assert.assertEquals(actual, expected);
		System.out.println("# Employee: " + employee);

	}

}
