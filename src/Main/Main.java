package Main;

import java.util.Scanner;

import com.service.implement.ExperiencedEmployeeImplement;
import com.service.implement.FresherEmployeeImplement;
import com.service.implement.InternEmployeeImplement;
import com.service.implement.OfficeImplement;

public class Main {
	static Scanner input = new Scanner(System.in);
	static ExperiencedEmployeeImplement experiencedEmployeeImplement = new ExperiencedEmployeeImplement();
	static FresherEmployeeImplement fresherEmployeeImplement = new FresherEmployeeImplement();
	static InternEmployeeImplement internEmployeeImplement = new InternEmployeeImplement();
	static OfficeImplement officeImplement = new OfficeImplement();

	public static void main(String[] args) {
		boolean isExit = false;
		showMenu();

		while (true) {
			System.out.print("Please select your choice: ");
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				officeImplement.addOffice();
				break;
			case 2:
				officeImplement.getOffices();
				break;
			case 3:
				experiencedEmployeeImplement.addEmployee();
				break;
			case 4:
				experiencedEmployeeImplement.getEmployees();
				break;
			case 5:
				fresherEmployeeImplement.addEmployee();
				break;
			case 6:
				fresherEmployeeImplement.getEmployees();
				break;
			case 7:
				internEmployeeImplement.addEmployee();
				break;
			case 8:
				internEmployeeImplement.gerEmployees();
				break;
			case 9:
				System.out.println("Input Office Id: ");
				int idOffice = input.nextInt();
				experiencedEmployeeImplement.findExperiencedEmployeeByOfficeId(idOffice);
				fresherEmployeeImplement.findFresherEmployeeByOfficeId(idOffice);
				internEmployeeImplement.findInternOfficeByOfficeId(idOffice);
				break;
			case 0:
				isExit = true;
			default:
				break;
			}
			if (isExit == true) {
				break;
			}
			showMenu();
		}
	}

	public static void showMenu() {
		System.out.println("---MENU---");
		System.out.println("1. Add Office");
		System.out.println("2. Display Office");
		System.out.println("3. Add Experienced Employee");
		System.out.println("4. Display Experienced Employee");
		System.out.println("5. Add Fresher Employee");
		System.out.println("6. Display Fresher Employee");
		System.out.println("7. Add Intern Employee");
		System.out.println("8. Display Intern Employee");
		System.out.println("9. Display all emmployees by Office Id");
		System.out.println("0. Exit");
	}

}
