package com.bank.beans;

import com.bank.exception.InSufficientFoundException;

public interface Bank {
	public void withdraw(double amount)throws InSufficientFoundException,IllegalArgumentException;
	public void deposite(double amount)throws InSufficientFoundException,IllegalArgumentException;
	public void display();
	public void setAccHName(String accHName);
	public void setMob(long mob);
	public void setAadharNo(long aadharNo);
	public void setAmount(double amount);
}
