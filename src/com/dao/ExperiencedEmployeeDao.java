package com.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.model.ExperiencedEmployee;

public class ExperiencedEmployeeDao {
	public List<ExperiencedEmployee> experiencedEmployees = new ArrayList<ExperiencedEmployee>();

	public void addEmployee(ExperiencedEmployee experiencedEmployee) {
		writeExperiencedEmployee(experiencedEmployee);
	}

	public List<ExperiencedEmployee> getEmployees() {
		List<ExperiencedEmployee> experiencedEmployees = readExperiencedEmployee();
		return experiencedEmployees;
	}

	public void writeExperiencedEmployee(ExperiencedEmployee experiencedEmployee) {
		ObjectOutputStream oos = null;
		try {
			FileOutputStream fos = new FileOutputStream("data/ExperiencedEmployee.txt");
			oos = new ObjectOutputStream(fos);
			experiencedEmployees.add(experiencedEmployee);
			oos.writeObject(experiencedEmployees);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (oos != null) {
					oos.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}

	}

	public List<ExperiencedEmployee> readExperiencedEmployee() {
		// ExperiencedEmployee experiencedEmployee = new ExperiencedEmployee();
		ObjectInputStream ois = null;
		try {
			FileInputStream fis = new FileInputStream("data/ExperiencedEmployee.txt");
			ois = new ObjectInputStream(fis);
			experiencedEmployees = (List<ExperiencedEmployee>) ois.readObject();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (ois != null) {
					ois.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		return experiencedEmployees;

	}
}
