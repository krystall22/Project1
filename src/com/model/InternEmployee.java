package com.model;

import com.constant.EmployeeType;

public class InternEmployee extends Employee {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String major;
	private int workingHours;

	@Override
	int calculatedSalary() {
		return workingHours * getPaymentPerHour();
	}

	public InternEmployee() {
		super();
	}

	public InternEmployee(int id, String name, EmployeeType employeeType, int idOffice, int paymentPerHour,
			String major, int workingHours) {
		super(id, name, employeeType, idOffice, paymentPerHour);
		this.major = major;
		this.workingHours = workingHours;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}

	@Override
	public String toString() {
		return "InternEmployee [major=" + major + ", workingHours=" + workingHours + ", id=" + id + ", name=" + name
				+ ", employeeType=" + employeeType + ", idOffice=" + idOffice + ", paymentPerHour=" + paymentPerHour
				+ ", calculatedSalary()=" + calculatedSalary() + "]";
	}

}
