package com.model;

import com.constant.EmployeeType;

public class ExperiencedEmployee extends Employee {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int expInYear;

	@Override
	int calculatedSalary() {
		return 8 * getPaymentPerHour();
	}

	public ExperiencedEmployee() {
		super();
	}

	public ExperiencedEmployee(int id, String name, EmployeeType employeeType, int idOffice, int paymentPerHour,
			int expInYear) {
		super(id, name, employeeType, idOffice, paymentPerHour);
		this.expInYear = expInYear;
	}

	public int getExpInYear() {
		return expInYear;
	}

	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}

	@Override
	public String toString() {
		return "ExperiencedEmployee [expInYear=" + expInYear + ", id=" + id + ", name=" + name + ", employeeType="
				+ employeeType + ", idOffice=" + idOffice + ", paymentPerHour=" + paymentPerHour
				+ ", calculatedSalary()=" + calculatedSalary() + "]";
	}

}
