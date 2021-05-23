package com.model;

import com.constant.EmployeeType;

public class FresherEmployee extends Employee {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String graduationRrank;

	@Override
	int calculatedSalary() {
		return 8 * getPaymentPerHour();
	}

	public FresherEmployee() {
		super();
	}

	public FresherEmployee(int id, String name, EmployeeType employeeType, int idOffice, int paymentPerHour,
			String graduationRank) {
		super(id, name, employeeType, idOffice, paymentPerHour);
		this.graduationRrank = graduationRank;
	}

	public String getGraduationRrank() {
		return graduationRrank;
	}

	public void setGraduationRrank(String graduationRrank) {
		this.graduationRrank = graduationRrank;
	}

	@Override
	public String toString() {
		return "FresherEmployee [graduationRrank=" + graduationRrank + ", id=" + id + ", name=" + name
				+ ", employeeType=" + employeeType + ", idOffice=" + idOffice + ", paymentPerHour=" + paymentPerHour
				+ ", calculatedSalary()=" + calculatedSalary() + "]";
	}

}
