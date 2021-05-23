package com.service.implement;

import java.util.List;
import java.util.Scanner;

import com.constant.EmployeeType;
import com.dao.InternEmployeeDao;
import com.model.InternEmployee;
import com.service.IInternEmployeeService;

public class InternEmployeeImplement implements IInternEmployeeService {
	Scanner input = new Scanner(System.in);
	InternEmployeeDao internEmployeeDao = new InternEmployeeDao();

	@Override
	public void addEmployee() {
		InternEmployee internEmployee = new InternEmployee();
		System.out.print("You are adding INTERN employee: ");
		System.out.print("\nInput Employe Id: ");
		int id = input.nextInt();
		internEmployee.setId(id);
		System.out.print("Input Employee Name: ");
		String name = input.next();
		internEmployee.setName(name);
		EmployeeType employeeType = EmployeeType.INTERN;
		internEmployee.setEmployeeType(employeeType);
		System.out.print("Input Office Id: ");
		int idOffice = input.nextInt();
		internEmployee.setIdOffice(idOffice);
		System.out.print("Input payment per hour: ");
		int paymentPerHour = input.nextInt();
		internEmployee.setPaymentPerHour(paymentPerHour);
		System.out.print("Input Employee's major: ");
		String major = input.next();
		internEmployee.setMajor(major);
		System.out.print("Input working hours: ");
		int workingHours = input.nextInt();
		internEmployee.setWorkingHours(workingHours);
		internEmployeeDao.addEmployee(internEmployee);
	}

	@Override
	public void gerEmployees() {
		List<InternEmployee> internEmployees = internEmployeeDao.readInternEmployee();
		if (internEmployees != null) {
			for (InternEmployee internEmployee : internEmployees) {
				System.out.println(internEmployee.toString());
			}
		} else {
			System.out.println("Not found!");
		}
	}

	public void findInternOfficeByOfficeId(int idOffice) {
		List<InternEmployee> internEmployees = internEmployeeDao.getEmployees();
		if (internEmployees != null)
			for (InternEmployee internEmployee : internEmployees) {
				if (internEmployee.getIdOffice() == idOffice) {
					System.out.println(internEmployees.toString());
				}
			}
		else {
			System.out.println("Not found");
		}
	}

}
