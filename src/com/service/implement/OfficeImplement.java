package com.service.implement;

import java.util.List;
import java.util.Scanner;

import com.dao.OfficeDao;
import com.model.Office;
import com.service.IOfficeService;

public class OfficeImplement implements IOfficeService {
	Scanner input = new Scanner(System.in);
	OfficeDao officeDao = new OfficeDao();

	@Override
	public void addOffice() {
		Office office = new Office();
		System.out.print("You are adding Office: ");
		System.out.print("\nInput Office Id: ");
		int idOffice = input.nextInt();
		office.setIdOffice(idOffice);
		System.out.print("Input Office's location: ");
		String location = input.next();
		office.setLocation(location);
		System.out.print("Input number of employees: ");
		int numberOfEmployee = input.nextInt();
		office.setNumberOfEmployee(numberOfEmployee);
		officeDao.addOffice(office);

	}

	@Override
	public void getOffices() {
		List<Office> offices = officeDao.getOffice();
		if (offices != null) {
			for (Office office : offices) {
				System.out.println(office.toString());
			}
		} else {
			System.out.println("Not found!");
		}

	}

}
