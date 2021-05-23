package com.service.implement;

import java.util.List;
import java.util.Scanner;

import com.constant.EmployeeType;
import com.dao.ExperiencedEmployeeDao;
import com.model.ExperiencedEmployee;
import com.service.IExperiencedEmployeeService;

public class ExperiencedEmployeeImplement implements IExperiencedEmployeeService {
	Scanner input = new Scanner(System.in);
	ExperiencedEmployeeDao experiencedEmployeeDao = new ExperiencedEmployeeDao();

	@Override
	public void addEmployee() {
		ExperiencedEmployee experiencedEmployee = new ExperiencedEmployee();
		System.out.print("You are adding EXPERIENCED Employee...");
		System.out.print("\nInput Employee Id: ");
		int id = input.nextInt();
		experiencedEmployee.setId(id);
		System.out.print("Input Employee Name: ");
		String name = input.next();
		experiencedEmployee.setName(name);
		EmployeeType employeeType = EmployeeType.EXPERIENCED;
		experiencedEmployee.setEmployeeType(employeeType);
		System.out.print("Input Office Id: ");
		int idOffice = input.nextInt();
		experiencedEmployee.setIdOffice(idOffice);
		System.out.print("Input payment per hour: ");
		int paymentPerHour = input.nextInt();
		experiencedEmployee.setPaymentPerHour(paymentPerHour);
		System.out.print("Input year of experience: ");
		int expInYear = input.nextInt();
		experiencedEmployee.setExpInYear(expInYear);
		experiencedEmployeeDao.addEmployee(experiencedEmployee);
	}

	@Override
	public void getEmployees() {
		// ExperiencedEmployee experiencedEmployee =
		// experiencedEmployeeDao.getEmployee();

		List<ExperiencedEmployee> experiencedEmployees = experiencedEmployeeDao.getEmployees();
		if (experiencedEmployees != null) {
			for (ExperiencedEmployee experiencedEmployee : experiencedEmployees) {
				System.out.println(experiencedEmployee.toString());
			}
		} else {
			System.out.println("Not found!");
		}
	}

	public void findExperiencedEmployeeByOfficeId(int idOffice) {
		List<ExperiencedEmployee> experiencedEmployees = experiencedEmployeeDao.getEmployees();
		if (experiencedEmployees != null)
			for (ExperiencedEmployee experiencedEmployee : experiencedEmployees) {
				if (experiencedEmployee.getIdOffice() == idOffice) {
					System.out.println(experiencedEmployee.toString());
				}
			}
		else {
			System.out.println("Not found");
		}
	}

}
