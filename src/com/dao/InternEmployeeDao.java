package com.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.model.InternEmployee;

public class InternEmployeeDao {
	List<InternEmployee> internEmployees = new ArrayList<InternEmployee>();

	public void addEmployee(InternEmployee internEmployee) {
		writeInternEmployee(internEmployee);
	}

	public List<InternEmployee> getEmployees() {
		List<InternEmployee> internEmployees = readInternEmployee();
		return internEmployees;
	}

	public void writeInternEmployee(InternEmployee internEmployee) {
		ObjectOutputStream oos = null;

		try {
			FileOutputStream fos = new FileOutputStream("data/InternEmployee");
			oos = new ObjectOutputStream(fos);
			internEmployees.add(internEmployee);
			oos.writeObject(internEmployees);
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

	public List<InternEmployee> readInternEmployee() {
		ObjectInputStream ois = null;

		try {
			FileInputStream fis = new FileInputStream("data/InternEmployee");
			ois = new ObjectInputStream(fis);
			internEmployees = (List<InternEmployee>) ois.readObject();
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
		return internEmployees;
	}
}
