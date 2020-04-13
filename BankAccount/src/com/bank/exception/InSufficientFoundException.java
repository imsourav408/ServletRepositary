package com.bank.exception;

@SuppressWarnings("serial")
public class InSufficientFoundException extends Exception{
	public InSufficientFoundException() {
		super("Your Account Balance is Low");
	}
	public InSufficientFoundException(String msg) {super(msg);}
}
