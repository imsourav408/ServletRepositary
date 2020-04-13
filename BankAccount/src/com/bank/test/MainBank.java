package com.bank.test;

import java.util.Scanner;

import com.bank.beans.Bank;

public class MainBank {

	public static void main(String[] args) {
		Scanner sc=null;
		sc=new Scanner(System.in);
		String bankName=null;
		Bank b=null;
		System.out.println("Enter your Bank Name");
		bankName=sc.nextLine();
		try {
			b=(Bank)Class.forName(bankName).newInstance();
		}
		catch(ClassNotFoundException cnf) {
			System.out.println("Sorry!! Bank is not available");
			return;
		}
		catch(Exception e) {
			System.out.println("Internal Problem Occur");
			e.printStackTrace();
			return;
		}
		
	}

}
