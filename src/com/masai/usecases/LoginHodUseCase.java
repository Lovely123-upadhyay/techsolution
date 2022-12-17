package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.HODDao;
import com.masai.daoImpl.HODDaoImpl;
import com.masai.exceptions.ComplainException;
import com.masai.exceptions.EmployeeException;
import com.masai.exceptions.EngineerException;
import com.masai.exceptions.HodException;
import com.masai.exceptions.MyException;


public class LoginHodUseCase {

	public static void main(String[] args) throws EmployeeException, MyException, EngineerException, ComplainException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username:");
		String username = sc.next();
		
		System.out.println("Enter Password:");
		String password = sc.next();
		
		HODDao d = new HODDaoImpl();
		
		
		String result;
		try {
			result = d.LoginHOD(username, password);
			System.out.println(result);
			HODDriver.main(args);
		} catch (HodException e) {
			e.printStackTrace();
		}
		
	}

}
