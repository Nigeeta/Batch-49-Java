package com.Exponent.BankApplication.Controller;

import java.util.Scanner;

import com.Exponent.BankApplication.serviceImplementation.SBI;

public class AdminController {
	public static void main(String[] args) {
		System.out.println("---------WELCOME TO SBI BANK--------------");
		Scanner sc = new Scanner(System.in);
		SBI s = new SBI();
		boolean flag = true;
		while (flag) {
			System.out.println("---------------------------------");
			System.out.println("---------------------------------");
			System.out.println("1: CREATE BANK ACCOUNT      ");
			System.out.println("2: SHOW ACCOUNT DETAILS     ");
			System.out.println("3: SHOW ACCOUNT BALANCE     ");
			System.out.println("4: DEPOSITE MONEY           ");
			System.out.println("5: WITHDRAW MONEY           ");
			System.out.println("6: UPDATE ACCOUNT DETAILS   ");
			System.out.println("7: EXIT                     ");
			System.out.println("---------------------------------");
			System.out.println("---------------------------------");
			System.out.println("ENTER YOUR CHOICE ");
			System.out.System.out.println("hello");
			int ch = sc.nextInt();
			switch (ch) {
				case 1:
					s.createAccount();
					break;
				case 2:
					s.showAccountDetails();
					break;
				case 3:
					s.showAccountBalance();
					break;
				case 4:
					s.depositeMoney();
					break;
				case 5:
					s.withdrawMoney();
					break;
				case 6:
					s.UpdateAccountDetails();
					break;
				case 7:
					flag = false;
					break;
				default:
					System.out.println("WRONG CHOICE ENTERED");
					break;
			}

		}
		sc.close();
		System.out.println("THANK YOU FOR BANKING ..!!!!!!!!!");

	}

}
