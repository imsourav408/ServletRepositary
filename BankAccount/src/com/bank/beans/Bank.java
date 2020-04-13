package com.bank.beans;

import com.bank.exception.InSufficientFoundException;

public interface Bank {
	public void withdraw(double amount)throws InSufficientFoundException,IllegalArgumentException;
	public void deposite(double amount)throws InSufficientFoundException,IllegalArgumentException;
	public void display() ;
}
