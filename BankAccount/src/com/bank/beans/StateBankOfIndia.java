package com.bank.beans;

import com.bank.exception.InSufficientFoundException;

public class StateBankOfIndia implements Bank {
	String accHName;
	long accNo;
	long mob;
	long aadharNo;
	double amount;
	public StateBankOfIndia(String accHName,long mob,long aadharNo,double amount) throws IllegalArgumentException {
		String accNo="";
		for(int i=0;i<10;i++) {
			accNo=accNo+(int)(Math.random()*10);
		}
		this.accNo=Long.parseLong(accNo);
		this.accHName=accHName;
		this.mob=mob;
		this.aadharNo=aadharNo;
		if(amount<=0) {
			throw new IllegalArgumentException("Enter Valid Balance only");
		}
		else
			this.amount=amount;
	}
	@Override
	public void withdraw(double amount) throws InSufficientFoundException, IllegalArgumentException {
		if(amount>this.amount) {
			throw new InSufficientFoundException();
		}
		else if(amount<=0)
			throw new IllegalArgumentException();
		else
		 this.amount=this.amount-amount;
	}
	@Override
	public void deposite(double amount) throws InSufficientFoundException, IllegalArgumentException {
		if(amount<=0)
			throw new IllegalArgumentException("Enter valid amount only");
		else
			this.amount=this.amount+amount;
	}
	@Override
	public void display() {
		System.out.println("Account Number: "+accNo);
		System.out.println("Account Holder Name: "+accHName);
		System.out.println("Mobile: "+mob);
		System.out.println("Aadhar Card Number: "+aadharNo);
		System.out.println("Balance: "+amount);
	}
}
