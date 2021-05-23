package com.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.model.FresherEmployee;

public class FresherEmployeeDao {
	List<FresherEmployee> fresherEmployees = new ArrayList<FresherEmployee>();

	public void addEmployee(FresherEmployee fresherEmployee) {
		writeFresherEmployee(fresherEmployee);
	}

	public List<FresherEmployee> getEmployees() {
		List<FresherEmployee> fresherEmployees = readFresherEmployee();
		return fresherEmployees;
	}

	public void writeFresherEmployee(FresherEmployee fresherEmployee) {
		ObjectOutputStream oos = null;
		try {
			FileOutputStream fos = new FileOutputStream("data/FresherEmployee");
			oos = new ObjectOutputStream(fos);
			fresherEmployees.add(fresherEmployee);
			oos.writeObject(fresherEmployees);
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

	public List<FresherEmployee> readFresherEmployee() {
		ObjectInputStream ois = null;
		try {
			FileInputStream fis = new FileInputStream("data/FresherEmployee");
			ois = new ObjectInputStream(fis);
			fresherEmployees = (List<FresherEmployee>) ois.readObject();
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
		return fresherEmployees;
	}
}