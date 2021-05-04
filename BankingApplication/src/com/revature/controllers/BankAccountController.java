package com.revature.controllers;

import java.util.Scanner;

public class BankAccountController {

	private static Scanner scan = new Scanner(System.in);
	static int userChoice;
	static String userStringInput;
	
	public static void init() {
		
		System.out.println("Enter 1 for user login \n Enter 2 to register for user account");
		userChoice = scan.nextInt();
		if(userChoice == 1) {
			System.out.println("Enter username: ");
			userStringInput = scan.next();
			//check that username exists, if yes:
			System.out.println("Enter password: ");
			userStringInput = scan.next();
			//check that password exists, if yes, log user in
			
			//if user is employee
			System.out.println("Enter 1 for viewing a specific client account \n Enter 2 for to view the log of all transactions");
			
			//if user is client
			System.out.println("Enter 1 to view balance of specific account \n Enter 2 to make a withdrawal/deposit \n"
					+ "Enter 3 to apply for a new account \n Enter 4 to post a money transfer to another account \n"
					+ "Enter 5 to accept a money transfer from another account");
			
			//if user is neither a client of employee
			System.out.println("Would you like to apply for a client account(Y/N)?");
		}
	}
}
