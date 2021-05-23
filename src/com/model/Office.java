package com.model;

import java.io.Serializable;

public class Office implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idOffice;
	private String location;
	private int numberOfEmployee;

	public Office() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Office(int idOffice, String location, int numberOfEmployee) {
		super();
		this.idOffice = idOffice;
		this.location = location;
		this.numberOfEmployee = numberOfEmployee;
	}

	public int getIdOffice() {
		return idOffice;
	}

	public void setIdOffice(int idOffice) {
		this.idOffice = idOffice;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNumberOfEmployee() {
		return numberOfEmployee;
	}

	public void setNumberOfEmployee(int numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}

	@Override
	public String toString() {
		return "Office [idOffice=" + idOffice + ", location=" + location + ", numberOfEmployee=" + numberOfEmployee
				+ "]";
	}

}
