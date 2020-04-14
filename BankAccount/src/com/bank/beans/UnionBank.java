package com.bank.beans;

import com.bank.exception.InSufficientFoundException;

public class UnionBank implements Bank {
	private static String BankName="Union Bank";
	private String accHName;
	private long accNo;
	private long mob;
	private long aadharNo;
	private double amount;
	public UnionBank() throws IllegalArgumentException {
		String accNo="";
		for(int i=0;i<10;i++) {
			accNo=accNo+(int)(Math.random()*10);
		}
		this.accNo=Long.parseLong(accNo);
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
	public void setAccHName(String accHName) {
		this.accHName = accHName;
	}
	public void setMob(long mob) {
		this.mob = mob;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public void setAmount(double amount) {
		if(amount<=0) {
			throw new IllegalArgumentException("Enter Valid Balance Only");
		}
		this.amount = amount;
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
		System.out.println("Bank: "+BankName);
		System.out.println("Account Number: "+accNo);
		System.out.println("Account Holder Name: "+accHName);
		System.out.println("Mobile: "+mob);
		System.out.println("Aadhar Card Number: "+aadharNo);
		System.out.println("Balance: "+amount);
	}
}
