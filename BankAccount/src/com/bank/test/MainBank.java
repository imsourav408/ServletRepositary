package com.bank.test;

import java.util.Scanner;

import com.bank.beans.Bank;

public class MainBank {

	public static void main(String[] args)throws Exception {
		Scanner sc=null;
		sc=new Scanner(System.in);
		String bankName=null;
		Bank b=null;
		System.out.println("Enter your Bank Name");
		bankName="com.bank.beans."+sc.nextLine();
		try {
			b=(Bank)Class.forName(bankName).newInstance();
		}
		catch(ClassNotFoundException cnf) {
			System.out.println("Sorry!! Bank is not available");
			return;
		}
		catch(Exception e) {
			System.out.println("Internal Problem Occurs");
			e.printStackTrace();
			return;
		}
		System.out.println("Welcome to "+bankName.substring(15));
		System.out.println("enter your name");
		String name=sc.nextLine();
		b.setAccHName(name);
		System.out.println("Enter your AadharNo:");
		b.setAadharNo(sc.nextLong());
		System.out.println("Enter Your Mobile Number:");
		b.setMob(sc.nextLong());
		System.out.println("Enter the balance you want to save in your account");
		b.setAmount(sc.nextDouble());
		loop:while(true){
			System.out.println("choose any options:");
			System.out.println("1.Account details");
		    System.out.println("2.Withdraw");
		    System.out.println("3.Deposite");
		    System.out.println("4.exit");
		    int optn=sc.nextInt();
			switch (optn)
			{
			case 1:
				b.display();
			break;
			case 2:{
				System.out.println("enter your pin");
				int pin=sc.nextInt();
				if(pin==1234){
					System.out.println("enter the amount for withdraw");
				    double amt=sc.nextDouble();
				    b.withdraw(amt);
				}
				else
					System.out.println("invalid pin");
				break;
			}
			case 3:{
				System.out.println("enter the amount for deposite");
				double amt=sc.nextDouble();
				b.deposite(amt);
				break;
			}
			case 4:break loop;
			default:System.out.println("enter valid key only");
			}
		}
	}
}

