package com.masai.usecases;

import java.util.Scanner;

import com.masai.Driver.Driver;
import com.masai.exceptions.ComplainException;
import com.masai.exceptions.EmployeeException;
import com.masai.exceptions.EngineerException;
import com.masai.exceptions.HodException;
import com.masai.exceptions.MyException;

public class HODDriver {

	public static void main(String[] args) throws EmployeeException, MyException, EngineerException, ComplainException {

		while (true) {

			System.out.println("1. Register Engineer");
			System.out.println("2. Get details of all Engineers");
			System.out.println("3. Delete an Engineer");
			System.out.println("4. Get all complaints registered");
			System.out.println("5. Assign Engineer");
			System.out.println("6. To Main Page \n");
			System.out.println("Please select an option to continue \n");

			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				RegisterEngineerUseCase1.main(args);
				break;

			case 2:
				GetAllEngineerUseCase.main(args);
				break;
			case 3:
				DeleteEngineer.main(args);
				break;
			case 4:
				GetAllComplaintsUseCase.main(args);
				break;
			case 5:
				assignedComplain.main(args);
				break;
			case 6:
				try {
					Driver.main(args);
				} catch (HodException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
