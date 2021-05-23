package com.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.model.Office;

public class OfficeDao {
	List<Office> offices = new ArrayList<Office>();

	public void addOffice(Office office) {
		writeOffice(office);
	}

	public List<Office> getOffice() {
		List<Office> offices = readOffice();
		return offices;
	}

	public void writeOffice(Office office) {
		ObjectOutputStream oos = null;

		try {
			FileOutputStream fos = new FileOutputStream("data/Office");
			oos = new ObjectOutputStream(fos);
			offices.add(office);
			oos.writeObject(offices);
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

	public List<Office> readOffice() {
		ObjectInputStream ois = null;

		try {
			FileInputStream fis = new FileInputStream("data/Office");
			ois = new ObjectInputStream(fis);
			offices = (List<Office>) ois.readObject();
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
		return offices;
	}

}
