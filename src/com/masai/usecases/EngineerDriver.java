package com.masai.usecases;

import java.util.Scanner;

import com.masai.Driver.Driver;
import com.masai.exceptions.ComplainException;
import com.masai.exceptions.EmployeeException;
import com.masai.exceptions.EngineerException;
import com.masai.exceptions.HodException;
import com.masai.exceptions.MyException;

public class EngineerDriver {

	public static void main(String u) throws EmployeeException, MyException, HodException, ComplainException {
		
		while (true) {

			System.out.println("1. Get Assigned Complaints");
			System.out.println("2. Update the status of Complaints");
			System.out.println("3. All Attended Problems");
			System.out.println("4. Update Password");
			System.out.println("5. Exit to Main Page");

			System.out.println("Please select an option to continue");

			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				AssignedComplaintsUseCase.main(u);
				break;
			case 2:
				updateComplainStatus.main(u);
				break;
			case 3:
				GetCompletedComplaintUseCases.main(u);
				break;
			case 4:
				UpdatePasswordUseCases.main(u);
				break;

			case 5:
				try {
					Driver.main(null);
				} catch (EngineerException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
