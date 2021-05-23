package com.model;

import java.io.Serializable;

import com.constant.EmployeeType;

public abstract class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected int id;
	protected String name;
	protected EmployeeType employeeType;
	protected int idOffice;
	protected int paymentPerHour;

	abstract int calculatedSalary();

	public Employee() {
		super();
	}

	public Employee(int id, String name, EmployeeType employeeType, int idOffice, int paymentPerHour) {
		super();
		this.id = id;
		this.name = name;
		this.employeeType = employeeType;
		this.idOffice = idOffice;
		this.paymentPerHour = paymentPerHour;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EmployeeType getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}

	public int getIdOffice() {
		return idOffice;
	}

	public void setIdOffice(int idOffice) {
		this.idOffice = idOffice;
	}

	public int getPaymentPerHour() {
		return paymentPerHour;
	}

	public void setPaymentPerHour(int paymentPerHour) {
		this.paymentPerHour = paymentPerHour;
	}

}
