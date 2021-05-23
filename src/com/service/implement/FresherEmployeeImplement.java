package com.service.implement;

import java.util.List;
import java.util.Scanner;

import com.constant.EmployeeType;
import com.dao.FresherEmployeeDao;
import com.model.FresherEmployee;
import com.service.IFresherEmployeeService;

public class FresherEmployeeImplement implements IFresherEmployeeService {
	Scanner input = new Scanner(System.in);
	FresherEmployeeDao fresherEmployeeDao = new FresherEmployeeDao();

	public void addEmployee() {
		FresherEmployee fresherEmployee = new FresherEmployee();
		System.out.print("You are adding FRESHER Employee...");
		System.out.print("\nInput Employee Id: ");
		int id = input.nextInt();
		fresherEmployee.setId(id);
		System.out.print("Input Employee Name: ");
		String name = input.next();
		fresherEmployee.setName(name);
		EmployeeType employeeType = EmployeeType.FRESHER;
		fresherEmployee.setEmployeeType(employeeType);
		System.out.print("Input Office Id: ");
		int idOffice = input.nextInt();
		fresherEmployee.setIdOffice(idOffice);
		System.out.print("Input payment per hour: ");
		int paymentPerHour = input.nextInt();
		fresherEmployee.setPaymentPerHour(paymentPerHour);
		System.out.print("Input graduation rank: ");
		String graduationRank = input.next();
		fresherEmployee.setGraduationRrank(graduationRank);
		fresherEmployeeDao.addEmployee(fresherEmployee);
	}

	@Override
	public void getEmployees() {
		List<FresherEmployee> fresherEmployees = fresherEmployeeDao.getEmployees();
		if (fresherEmployees != null) {
			for (FresherEmployee fresherEmployee : fresherEmployees) {
				System.out.println(fresherEmployee.toString());
			}
		} else {
			System.out.println("Not found!");
		}

	}

	public void findFresherEmployeeByOfficeId(int idOffice) {
		List<FresherEmployee> fresherEmployees = fresherEmployeeDao.getEmployees();
		if (fresherEmployees != null)
			for (FresherEmployee fresherEmployee : fresherEmployees) {
				if (fresherEmployee.getIdOffice() == idOffice) {
					System.out.println(fresherEmployee.toString());
				}
			}
		else {
			System.out.println("Not found");
		}
	}
}
