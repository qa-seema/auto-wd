package com.wd.auto;

public class Company {

	String companyName;
	String companyAddress;

	public Company(String companyName, String companyAddress) {
		this.companyName = companyName;
		this.companyAddress = companyAddress;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String name) {
		this.companyName = name;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", companyAddress=" + companyAddress + "]";
	}

}
